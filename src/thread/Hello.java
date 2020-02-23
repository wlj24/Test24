package thread;

 class th extends Thread{
	public void run(){
		while(true){
		System.out.println("hello");
		try{
			this.sleep(5000);
		}
		catch(InterruptedException e){
			System.out.println("ww");
			
		}
		}
	}

}
 public class Hello{
	 public static void main(String args[]){
		 th hello=new th();
		hello.start();
		hello.interrupt();
	 }
 }
