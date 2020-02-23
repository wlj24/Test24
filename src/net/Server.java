package net;

import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
ServerSocket ss=new ServerSocket(3000);
while(true){
	Socket s=ss.accept();
	PrintStream ps=new PrintStream(s.getOutputStream());
	ps.println("ÄãºÃ");
	ps.close();
	s.close();	
}

	}

}
