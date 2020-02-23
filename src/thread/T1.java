package thread;

public class T1 {
	public static void main(String args[]){
		x x=new x("a1");
		x x1=new x("a2");
		for(int i=0;i<50;i++)
			System.out.println("ddd"+i);
	
		x1.start();
		x.start();
	}	
}
class x extends Thread{
	
	x(String name){
		super(name);
	}
	public void run(){
		for(int i=0;i<50;i++)
		System.out.println(i+x.currentThread().getName());
	}
}