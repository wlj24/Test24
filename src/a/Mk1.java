package a;

import java.util.Scanner;

public class Mk1 {
	public static void main(String args[]){
		int count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("������һ����:");
		int m=s.nextInt();
		if(m>=0&&m<=99999){
			while(m!=0){
				count++;
				m=m/10;
			}
			System.out.println(count+"λ��");
			
		}
		else{
			System.out.println("��������");
		}
	}

}
