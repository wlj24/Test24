package io.File;

import java.io.File;
import java.io.IOException;

/**
 * Created by wlj on 2018/12/2.
 */
public class FileTest {
    public static void main(String[] args) throws IOException {
        File file=new File("E:\\360Downloads\\Software");
//        listDir(file);
        listAllFiles(file);
    }


    public static void listDir(File file){
        if(file.isDirectory()){
            File result[]=file.listFiles();
            if(result!=null){
            for(int x=0;x<result.length;x++){

                    listDir(result[x]);
                }
            }
        }
        System.out.println(file);
    }

    public static void listAllFiles(File file){
        if(file==null || !file.exists()){
            return;
        }
        if(file.isFile()){
            System.out.println(file.getName());
            return;
        }

        for(File file1:file.listFiles()){
            listAllFiles(file1);
        }
    }
}
