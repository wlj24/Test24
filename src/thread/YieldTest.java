package thread;

public class YieldTest extends Thread{
public YieldTest(String name){
	super(name);
}
public void run(){
	for(int i=0;i<50;i++){
		System.out.println(getName()+" "+i);
		if(i==20){
			Thread.yield();
		}
	}
}
public static void main(String args[]){
	YieldTest ty1=new YieldTest("¸ß¼¶");
	//ty1.setPriority(MAX_PRIORITY);
	ty1.start();
	YieldTest ty2=new YieldTest("µÍ¼¶");
	//ty2.setPriority(MIN_PRIORITY);
	ty2.start();
	
}
}
