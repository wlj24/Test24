package thread;

public class Threadjoin implements Runnable{
	Cake cake;
	Thread joinThread;
	public void setJoinThread(Thread t){
		joinThread=t;
	}
	public void run(){
		if(Thread.currentThread().getName().equals("�˿�")){
			System.out.println(Thread.currentThread().getName()+"�ȵ�"
					+joinThread.getName()+"�������յ���");
			try{
				joinThread.start();
				joinThread.join();
			}
			catch(InterruptedException e){
				
			}
			System.out.println(Thread.currentThread().getName()+
					"����"+cake.name+"��Ǯ"+cake.price);
		}
	
		else if(Thread.currentThread()==joinThread){
			System.out.println(joinThread.getName()+"��ʼ�������յ���,��ȡ�");
			try{Thread.sleep(2000);
		}
			catch(InterruptedException e){}
				cake=new Cake("���յ���",158);
				System.out.println(joinThread.getName()+"�������");
			}
	}
		class Cake{
			int price;
			String name;
			Cake(String name,int price){
				this.name=name;
				this.price=price;
			}
		}

	}

