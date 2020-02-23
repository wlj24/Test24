package net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.net.Socket;

public class ServerThread implements Runnable{
Socket s=null;
BufferedReader br=null;
public ServerThread(Socket s) throws IOException{
	this.s=s;
	br=new BufferedReader(new InputStreamReader(s.getInputStream()));
	
}
public void run(){
	try{
		String content=null;
		while((content=readFormClient())!=null){
			for(Socket s:Myserver.socketList){
				PrintStream ps=new PrintStream(s.getOutputStream());
				ps.println(content);
				
			}
		}
	}catch(IOException e){
		e.printStackTrace();
	}
	
}
public String readFormClient(){
	try
	{
		return br.readLine();
	}
	catch(IOException e){
		Myserver.socketList.remove(s);
	}
	return null;
	
}
}
