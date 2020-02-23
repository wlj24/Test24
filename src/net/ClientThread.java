package net;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class ClientThread implements Runnable{
private Socket s;
BufferedReader br=null;
public ClientThread(Socket s) throws IOException{
	this.s=s;
	br=new BufferedReader(new InputStreamReader(s.getInputStream()));
	
}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		try{
			String content=null;
			while((content=br.readLine())!=null){
				System.out.println(content);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
