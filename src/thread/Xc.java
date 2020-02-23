package thread;

public class Xc extends Thread{
	private int i;
	public void run(){
		for(i=0;i<10;i++){
			System.out.println(getName()+""+i);
		}
	}
	public static void main(String[] args){
		for(int i=0;i<10;i++){
			System.out.println(Thread.currentThread().getName()
					+" "+i);
			if(i==5)
			{
				new Xc().start();
				new Xc().start();
			}
		}
		
	}

}
