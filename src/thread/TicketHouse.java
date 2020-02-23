package thread;

public class TicketHouse implements Runnable{
	int fiveamount=2,tenamount=0,twentyamount=0;
	public void run(){
		if(Thread.currentThread().getName().equals("张飞")){
			saleTicket(20);
		}
			else if(Thread.currentThread().getName().equals("我")){
				saleTicket(5);
			}
	}
		private synchronized void saleTicket(int money){
			if(money==5){
				fiveamount=fiveamount+1;
				System.out.println("给"+Thread.currentThread().getName()+
						"入场"+Thread.currentThread().getName()+"钱正好");
	
			}
			else if(money==20){
				while(fiveamount<3){
					try{
						System.out.println("\n"+Thread.currentThread().getName()+
								"靠边等。。。");
					wait();
						System.out.println("\n"+Thread.currentThread().getName()+
								"继续买票");
					}
					catch(InterruptedException e){}
					
					}
				fiveamount=fiveamount-3;
				twentyamount=twentyamount+1;
				System.out.println("给"+Thread.currentThread().getName()+
						"入场券"+Thread.currentThread().getName()+"给20，找15元");
				
				}
			notifyAll();
			}
		}
	
