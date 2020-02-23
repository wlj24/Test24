package net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
Socket socket=new Socket("192.168.239.1",3000);
BufferedReader br=new BufferedReader(new InputStreamReader(socket.getInputStream()));
String line=br.readLine();
System.out.println("来自服务器的数据："+line);
br.close();
socket.close();
	}

}
