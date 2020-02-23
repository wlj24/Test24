package io.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.*;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;

public class NioServer {
    public static void main(String[] args) throws IOException {
        NioServer nioServer=new NioServer();
        nioServer.start();
    }


    public void start() throws IOException{
        /**
         * 创建selector
         */
        Selector selector=Selector.open();
        /**
         * 创建channel通道
         */
        ServerSocketChannel socketChannel=ServerSocketChannel.open();
        /**
         * 设置非阻塞
         */
        socketChannel.configureBlocking(false);
        /**
         * 为channel绑定端口
         */
        ServerSocket serverSocket=socketChannel.socket();
        InetSocketAddress address=new InetSocketAddress("127.0.0.1",8000);
        serverSocket.bind(address);

        /**
         * 注册监听事件
         */
        socketChannel.register(selector, SelectionKey.OP_ACCEPT);

        System.out.println("服务器启动成功");


        while (true){
            /**
             * 获取channel数量
             */
           int redayChannels= selector.select();
           if(redayChannels==0){
               continue;
           }
            /**
             * 获取可用的channel集合
             */
            Set<SelectionKey> keys=selector.selectedKeys();
            Iterator iterator=keys.iterator();
            while (iterator.hasNext()){
                SelectionKey selectionKey= (SelectionKey) iterator.next();

                /**
                 * 接入事件
                 */
                if(selectionKey.isAcceptable()){
                    acceptHandler(socketChannel,selector);
                    /**
                     *可读事件
                     */
                }else if(selectionKey.isReadable()){
                     readHandler(selectionKey,selector);
                }
                iterator.remove();

            }
        }
    }

    /**
     * 接入事件
     */
    private void acceptHandler(ServerSocketChannel serverSocketChannel,Selector selector) throws IOException {
     SocketChannel socketChannel1=serverSocketChannel.accept();
     socketChannel1.configureBlocking(false);
     socketChannel1.register(selector,SelectionKey.OP_READ);
     socketChannel1.write(Charset.forName("UTF-8").encode("你和聊天室都不是朋友关系，请注意隐私"));
    }

    private void  readHandler(SelectionKey selectionKey,Selector selector) throws IOException {
        SocketChannel socketChannel= (SocketChannel)selectionKey.channel();
        ByteBuffer byteBuffer=ByteBuffer.allocate(1024);
        String request="";
        while (socketChannel.read(byteBuffer)>0){
            byteBuffer.flip();
            request+= Charset.forName("UTF-8").decode(byteBuffer);
        }
        socketChannel.register(selector,SelectionKey.OP_READ);
        if(request.length()>0){
            System.out.println(request);
            broadCast(selector,socketChannel,request);
        }
    }

    private void broadCast(Selector selector,SocketChannel socketChannel,String request){
        Set<SelectionKey> selectionKeys=selector.keys();
        selectionKeys.forEach(selectkey->{
            Channel channel=selectkey.channel();
            if(channel instanceof SocketChannel&&socketChannel!=channel){
                try {
                    ((SocketChannel) channel).write(Charset.forName("UTF-8").encode(request));
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
        });
    }


}
