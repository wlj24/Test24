package io.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.SocketChannel;
import java.nio.charset.Charset;
import java.util.Scanner;

public class NioClient {


    public static void main(String[] args) throws Exception{
        NioClient nioClient=new NioClient();
        nioClient.start("1");


    }

    /**
     * 向服务端发送数据
     * @throws IOException
     */
    public void start(String clinetName) throws IOException {
        SocketChannel socketChannel=SocketChannel.open(new InetSocketAddress("127.0.0.1",8000));
        Selector selector=Selector.open();
        socketChannel.configureBlocking(false);
        socketChannel.register(selector, SelectionKey.OP_READ);
        Scanner scanner=new Scanner(System.in);
        new Thread(new NioClientHandler(selector)).start();
        while (scanner.hasNextLine()){
            String request=scanner.nextLine();
            if(request!=null){
                socketChannel.write(Charset.forName("UTF-8").encode(clinetName+request));
            }
        }
    }
}
