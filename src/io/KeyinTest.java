package io;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class KeyinTest {
public static void main(String args[]) throws IOException{
	InputStreamReader reader=new InputStreamReader(System.in);
	BufferedReader br=new BufferedReader(reader);
	String buffer=null;
	while((buffer=br.readLine())!=null)
	{
		if(buffer.equals("exit")){
			System.exit(1);
		}
		System.out.println("��������Ϊ��"+buffer);
	}
}
}
