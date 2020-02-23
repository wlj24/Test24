package io;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest {
public static void main(String args[]) throws IOException{
	FileReader fir=new FileReader("2.txt");
	char[] cbuf=new char[32];
	int hasRead=0;
	while((hasRead=fir.read(cbuf))>0){
		System.out.println(new String(cbuf,0,hasRead));
	}
	fir.close();
}
}
