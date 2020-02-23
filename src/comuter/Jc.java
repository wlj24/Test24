package comuter;


class A{
	float computer(float x,float y){
		return x+y;
	}
	public int g(int x,int y ){
		return x+y;
	}
}
class B extends A{
	float computer(float x,float y){
		return x*y;
	}
}

public class Jc {
	public static void main(String args[]){
		B b=new B();
		double r=b.computer(8,9);
		System.out.println(r);
		int m=b.g(12, 8);
		System.out.println(m);
	}

}
