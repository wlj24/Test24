package fifty;

import java.util.Scanner;

public class Test7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a,b,m;
Scanner s=new Scanner(System.in);
System.out.println("请输入一个整数: "); 
a=s.nextInt();
System.out.println("再输入一个整数: ");
b=s.nextInt();
deff cd=new deff();
m=cd.deff(a, b);
int n=a*b/m;
System.out.println(m);
System.out.println(n);

	}

}
class deff{
	public int deff(int x,int y){
		int t;
		if(x<y){
			t=x;
			x=y;
			y=t;
		}
		while(y!=0){
			if(x==y) return x;
			else{
				int k=x%y;
				x=y;
				y=k;
			}
		}
		return x;
	}
}