package thread;

public class Maipian {
public static void main(String args[]) throws InterruptedException{
	
	
	sp s1=new sp("1");
	s1.start();
	
	for(int i=0;i<10;i++){
		if(i==5){
			sp s=new sp("2");
			s.start();
		
			s.join();
			
		}
		System.out.println(Thread.currentThread().getName()+"..sale: "+i);
	}
	
	

}
}
class sp extends Thread{
private	int i;
	public sp(String name) {
	super(name);
}
	public sp() {
		// TODO Auto-generated constructor stub
	}
	public void run(){
	
	for(;i<10;i++){
		System.out.println(currentThread().getName()+"..sale: "+i);
	}
		
}
}