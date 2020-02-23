package test1;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class St {

public static void main(String args[]) throws UnsupportedEncodingException{
	String aa=new String("dd");
String bb="dd";
String cc="dd";
System.out.println(bb==cc);
System.out.println(aa==bb);
String s=new String();
	System.out.println(s);
	String a = "ABCa¥ÚÀ„c";
	byte[] b=a.getBytes();
	
		String c=new String(b,"utf-8");
	
	System.out.println(c);
	for(int i=0;i<b.length;i++){
		System.out.println(b[i]);
	}
	System.out.println("a = " + a);  
	a = a.replace('A', 'a');  
	System.out.println("a = " + a);  
	String ss = "123456";  
	  
	System.out.println("ss = " + ss);  
	  
	ss.replace('1', 'a');  
	  
	System.out.println("ss = " + ss); 
	String defaultCharsetName=Charset.defaultCharset().displayName();   
    System.out.println("defaultCharsetName:"+defaultCharsetName);  
}
}
