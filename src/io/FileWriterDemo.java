package io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo {
public static void main(String args[]) throws IOException{
	FileWriter fileWriter=new FileWriter("demo.txt");
	//���ַ���д�뵽����
	fileWriter.write("ddd");
	//ˢ���������еĻ����е�����
	//������ˢ��Ŀ�ĵ���
	fileWriter.flush();
	fileWriter.write("ffff");
	fileWriter.flush();
}
}
