package thread;

public class Test {
	public static void main(String args[]){
peo p=new peo();
input in=new input(p);
output out=new output(p);
Thread t1=new Thread(in);
Thread t2=new Thread(out);
t1.start();
t2.start();
}
}
class peo{
	String name="¶ä¶ä";
	String sex;
	public boolean flag=false;
	public synchronized  void r() throws InterruptedException {
		if(!flag){
			wait();
		}else{
		
		System.out.println(this.name+"..."+this.sex);
		flag=false;
		notify();
		}
	}
	public  synchronized void r1() {
		// TODOic  Auto-generated method stub
		try {
		if(flag){
				wait();
			} else{
		if(this.name.equals("¶ä¶ä")){
		this.sex="man";
		this.name="wlj";
		}	else{
			this.sex="Å®";
			this.name="¶ä¶ä";
		}
		flag=true;
		notify();
			}
		
	}catch(Exception e){
		e.printStackTrace();
	}
}
}
class input implements Runnable{
	peo p;
input(peo p){
		this.p=p;
	}
	public void run(){
		while(true){
		p.r1();
		}
	}
	
}
class output implements Runnable{
peo p;
output(peo p){
	this.p=p;
}
	public void run(){
		while(true){
		try {
			p.r();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		}
	}
	
	
}