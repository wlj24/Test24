package fifty;

import java.util.Scanner;

public class Test8 {
	public static void main(String args[]){ 
		double b=0,sum=0,c=0;
		Scanner s=new Scanner(System.in);
		System.out.println("��������ӵ���");
		int a=s.nextInt();
		System.out.println("��������ӵĸ���");
		int n=s.nextInt();
		for(int i=0;i<n;i++){
			b=a*Math.pow(10, i);
			c+=b;
			sum+=c;
			System.out.print(c+"+");
		}
		System.out.println("="+sum);
	}

}
