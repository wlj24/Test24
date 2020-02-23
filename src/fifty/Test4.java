package fifty;

import java.util.Scanner;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s=new Scanner(System.in);
System.out.println("请输入一个正整数:");
int n=s.nextInt();
int k=2;
System.out.println(n+"=");
while(k<=n){
	if(k==n){System.out.println(n);break;}
	else if(n%k==0){System.out.println(k+"*");n=n/k;}
	else k++;
}

	}

}
