package thread;

public class TicketHouse implements Runnable{
	int fiveamount=2,tenamount=0,twentyamount=0;
	public void run(){
		if(Thread.currentThread().getName().equals("�ŷ�")){
			saleTicket(20);
		}
			else if(Thread.currentThread().getName().equals("��")){
				saleTicket(5);
			}
	}
		private synchronized void saleTicket(int money){
			if(money==5){
				fiveamount=fiveamount+1;
				System.out.println("��"+Thread.currentThread().getName()+
						"�볡"+Thread.currentThread().getName()+"Ǯ����");
	
			}
			else if(money==20){
				while(fiveamount<3){
					try{
						System.out.println("\n"+Thread.currentThread().getName()+
								"���ߵȡ�����");
					wait();
						System.out.println("\n"+Thread.currentThread().getName()+
								"������Ʊ");
					}
					catch(InterruptedException e){}
					
					}
				fiveamount=fiveamount-3;
				twentyamount=twentyamount+1;
				System.out.println("��"+Thread.currentThread().getName()+
						"�볡ȯ"+Thread.currentThread().getName()+"��20����15Ԫ");
				
				}
			notifyAll();
			}
		}
	
