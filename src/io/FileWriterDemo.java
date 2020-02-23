package io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
public static void main(String args[]) throws IOException{
	FileWriter fileWriter=new FileWriter("demo.txt");
	//将字符串写入到流中
	fileWriter.write("ddd");
	//刷新流对象中的缓冲中的数据
	//将数据刷到目的地中
	fileWriter.flush();
	fileWriter.write("ffff");
	fileWriter.flush();
}
}
