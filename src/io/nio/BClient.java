package io.nio;

import java.io.IOException;

public class BClient {
    public static void main(String[] args) throws IOException {
        NioClient nioClient=new NioClient();
        nioClient.start("bbbb");
    }
}
