package io;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileReader fileReader=new FileReader("demo.txt");
/*int ch=0;
while((ch=fileReader.read())!=-1){
	System.out.println((char)ch);
};*/
char[] cs=new char[1024];
int num=0;
while((num=fileReader.read(cs))!=-1){
System.out.println(new String(cs,0,num));

	}
fileReader.close();
	}
}
