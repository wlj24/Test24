package lianxi;
import java.io.*;

public class E10_1 {
	public static void main(String[] args){
		File f=new File("D:\\Java","Conb.java");
		System.out.println(f.getName()+"�ǿɶ�����:"+f.canRead());
		System.out.println(f.getName()+"�ĳ���:"+f.length());
		System.out.println(f.getName()+"�ľ���·��"+f.getAbsoluteFile());
		File file=new File("new1.text");
		System.out.println("�ڵ�ǰĿ¼�´������ļ�"+file.getName());
		if(!file.exists()){
			try{
				file.createNewFile();
				System.out.println("�����ɹ�");
				
			}
			catch(IOException exp){
				
				
			}
		}
		}
		
	}


