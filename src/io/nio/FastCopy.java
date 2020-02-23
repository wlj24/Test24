package io.nio;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FastCopy {

    public static void main(String[] args) {
        try {
            fastcopy("1.txt","2.txt");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void fastcopy(String src,String dist) throws IOException {
        FileInputStream fileInputStream=new FileInputStream("1.txt");
        FileChannel fileChannel=fileInputStream.getChannel();
        FileOutputStream fileOutputStream=new FileOutputStream("2.txt");
        FileChannel fileChannel1=fileOutputStream.getChannel();
        ByteBuffer byteBuffer=ByteBuffer.allocate(1024);
        while (true){
            int r=fileChannel.read(byteBuffer);
            if(r==-1){
                break;
            }
            byteBuffer.flip();
            fileChannel1.write(byteBuffer);
            byteBuffer.clear();

        }
    }
}
