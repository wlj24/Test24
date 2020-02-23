package a;

class B{
	int x=100,y=200;
	public void setX(int a){
		x=a;
	}
	public void setY(int b){
		y=b;
	}
	public int getXYSum(){
		return x+y;
	}
}
public class Jia {
public static void main(String args[]){
	B b=new B();
	b.setX(-100);
	b.setY(-200);
	System.out.println(b.getXYSum());
}
}
