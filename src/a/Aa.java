package a;

public class Aa {
	
	int x;
	long y=x;
	
	public void f(int n){
		int m=0;
		int t=n+m;
		System.out.println(t);
	}
	public static void main(String args[]){
		Aa a=new Aa();
		
		System.out.println(a.y);
		a.f(5);
	}

}
