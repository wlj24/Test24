package lianxi;

class rf{
	float x;
	long y=(int)x;
	public  void f(int n){
		float m=0;
		double t=m+n+x+y;
		System.out.println(t);
	}
}
class Aj{
	int x=100;
	static long y=200; 

	public void f(){
		y=300;
	}
	 public  void g(){
		 x=-23;
	 }
}


public class Eryuan {
	public static void main(String args[]){
		rf cs=new rf();
		System.out.println(cs.x+"  "+cs.y);
		cs.f(5);
		
		
		}
		
	}


