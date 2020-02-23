package io;

import java.io.UnsupportedEncodingException;

public class StringTest {
    public static void main(String[] args) throws UnsupportedEncodingException {
        String a="王";
        byte[] bytes=a.getBytes("utf-8");
        byte[] bytes1=a.getBytes("GBK");
        System.out.println(bytes.length);
        System.out.println(bytes1.length);
    }
}
