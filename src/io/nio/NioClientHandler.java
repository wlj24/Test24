package io.nio;

import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Set;

public class NioClientHandler implements  Runnable{
     private Selector selector;

     public NioClientHandler(Selector selector){
         this.selector=selector;
     }
    @Override
    public void run() {
        try {
            while (true) {
                /**
                 * 获取channel数量
                 */
                int redayChannels = 0;

                redayChannels = selector.select();

                if (redayChannels == 0) {
                    continue;
                }
                /**
                 * 获取可用的channel集合
                 */
                Set<SelectionKey> keys = selector.selectedKeys();
                Iterator iterator = keys.iterator();
                while (iterator.hasNext()) {
                    SelectionKey selectionKey = (SelectionKey) iterator.next();

                    /**
                     * 接入事件
                     */
                 if (selectionKey.isReadable()) {
                        readHandler(selectionKey, selector);
                    }
                    iterator.remove();

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
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
        }
    }
}
