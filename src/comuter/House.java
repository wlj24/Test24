package comuter;

public class House implements Runnable{
	int waterAmount;
	public void setWater(int w){
		waterAmount=w;
		
	}
	public void run(){
		while(true){
			String name=Thread.currentThread().getName();
			if(name.equals("¹·")){
				System.out.println(name+"ºÈË®");
				waterAmount=waterAmount-2;
			}
			else if(name.equals("Ã¨")){
				System.out.println(name+"ºÈË®");
				waterAmount=waterAmount-1;
			}
			System.out.println("Ê£"+waterAmount);
			try{Thread.sleep(2000);
		}
			catch(InterruptedException e){}
				if(waterAmount<=0){
					return;
				}
			}
	}
	
	

}
