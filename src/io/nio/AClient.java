package io.nio;

import java.io.IOException;

public class AClient {
    public static void main(String[] args) throws IOException {
        NioClient nioClient=new NioClient();
        nioClient.start("A1");
    }
}
