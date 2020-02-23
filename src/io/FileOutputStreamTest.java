package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputStreamTest {
public static void main(String[] args) throws IOException{
	FileInputStream fis=new FileInputStream("D:\\Test\\src\\io\\FileOutputStreamTest.java");
	FileOutputStream fos=new FileOutputStream("newFile.text");
	byte[] bbuf=new byte[32];
	int hasRead=0;
	while((hasRead=fis.read(bbuf))>0){
		fos.write(bbuf,0,hasRead);
	}
	
}
}
