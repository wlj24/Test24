package io.File;

import java.io.*;
import java.util.Scanner;

/**
 * Created by wlj on 2018/12/3.
 */
public class CopyTest {
    public static void main(String[] args) throws IOException {
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("please comnamd: ");
//        String command=scanner.nextLine();
//        if(command!=null){
//            if(command.startsWith("copy")){
//                String[] fileName=command.split(" ");
//                String source=fileName[1];
//                String destination=fileName[2];
//                File file=new File(source);
//                if(file.exists()){
//                    InputStream fileInputStream=new FileInputStream(file);
//                    byte[] bytes=new byte[fileInputStream.available()];
//                    fileInputStream.read(bytes);
//                    FileOutputStream fileOutputStream=new FileOutputStream(destination);
//                    fileOutputStream.write(bytes);
//                    fileInputStream.close();
//                    fileOutputStream.close();
//                }else {
//                    System.out.println("source file not exist");
//                }
//
//            }
//        }

        try {
            copytest2("1.txt","2.txt");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void copytest2(String source,String destination) throws Exception{
        FileInputStream fileInputStream=new FileInputStream(source);
        FileOutputStream fileOutputStream=new FileOutputStream(destination);
        byte[] bytes=new byte[fileInputStream.available()];
        while (fileInputStream.read(bytes)!=-1){
            fileOutputStream.write(bytes);
        }
        fileInputStream.close();
        fileOutputStream.close();
    }
}
