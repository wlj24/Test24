package comuter;

public class House implements Runnable{
	int waterAmount;
	public void setWater(int w){
		waterAmount=w;
		
	}
	public void run(){
		while(true){
			String name=Thread.currentThread().getName();
			if(name.equals("��")){
				System.out.println(name+"��ˮ");
				waterAmount=waterAmount-2;
			}
			else if(name.equals("è")){
				System.out.println(name+"��ˮ");
				waterAmount=waterAmount-1;
			}
			System.out.println("ʣ"+waterAmount);
			try{Thread.sleep(2000);
		}
			catch(InterruptedException e){}
				if(waterAmount<=0){
					return;
				}
			}
	}
	
	

}
