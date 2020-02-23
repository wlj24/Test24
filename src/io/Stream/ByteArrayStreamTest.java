package io.Stream;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * Created by wlj on 2018/12/30.
 */
public class ByteArrayStreamTest {
    public static void main(String[] args) throws Exception{
        String str="www.mldn.cn";
        InputStream inputStream=new ByteArrayInputStream(str.getBytes());
        ByteArrayOutputStream outputStream=new ByteArrayOutputStream();
        int data=0;
        while ((data=inputStream.read())!=-1){
            outputStream.write(Character.toUpperCase(data));
        }
        System.out.println(outputStream.toByteArray());
        inputStream.close();
        outputStream.close();
    }
}
