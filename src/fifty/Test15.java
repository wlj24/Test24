package fifty;

import java.util.Scanner;

public class Test15 {
public static void main(String args[]){
	Scanner s=new Scanner(System.in);
	System.out.println("������һ��������");
	long a=s.nextLong();
	String ss=Long.toString(a);
	char[] ch=ss.toCharArray();
	int j=ch.length;
	System.out.println(a+"��һ��"+j+"λ��");
	System.out.println("���������:");
	for(int i=j-1;i>=0;i--){
		System.out.println(ch[i]);
	}
			
}
}
