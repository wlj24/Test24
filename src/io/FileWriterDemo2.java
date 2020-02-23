package io;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo2 {

	public static void main(String[] args) {
		FileWriter filewriter=null;
		try {
			// TODO Auto-generated method stub
			filewriter = new FileWriter("demo2.txt");
			filewriter.write("ddff");
			
		} catch (IOException e) {
			// TODO: handle exception
			e.printStackTrace();
		}finally{
			try {
				if(filewriter!=null)
				filewriter.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
