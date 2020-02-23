package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
FileReader fr=new FileReader("demo.txt");
char[] cs=new char[3];
int num=fr.read(cs);
System.out.println("cs="+num+"..."+new String(cs,0,num));
int num1=fr.read(cs);
System.out.println("cs1="+num1+"..."+new String(cs,0,num1));
int num2=fr.read(cs);
System.out.println("cs2="+num2+"..."+new String(cs,0,num2));
int num3=fr.read(cs);
System.out.println("cs2="+num3+"..."+new String(cs,0,num3));
fr.close();
	}

}
