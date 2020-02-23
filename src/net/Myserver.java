package net;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
public class Myserver {
public static ArrayList<Socket> socketList=new ArrayList<Socket>();
public static void main(String[] args) throws IOException{
	ServerSocket ss=new ServerSocket(20000);
	while(true){
		Socket s=ss.accept();
		socketList.add(s);
		new Thread(new ServerThread(s)).start();
	}
}
}
