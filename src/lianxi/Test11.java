package lianxi;

import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test11 t=new Test11();
		System.out.println("请输入三个数");
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		t.bj(a, b, c);
	/*int m=t.com(a,b);
	int	 n=t.com(m, c);
		System.out.println(n);
		System.out.println(m);
		if(a!=m&&a!=n) System.out.println(a);
        if(b!=m&&b!=n) System.out.println(b);
        if(c!=m&&c!=n) System.out.println(c);
	*/
	}
public int com(int x,int y){
	if(x>y) return x;
	else return y;
	
}
public void bj(int x,int y,int z){
	x=x>y?x:y;
	z=x>z?x:z;
	System.out.println(z);
System.out.println(x);
System.out.println(y);
}
}
