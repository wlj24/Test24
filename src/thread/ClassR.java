package thread;

public class ClassR implements Runnable {
	Thread student,teacher;
	ClassR(){
		teacher=new Thread(this);
		student=new Thread(this);
		teacher.setName("������");
		student.setName("����");
			
	}
	public void run(){
		if(Thread.currentThread()==student){
			try{
				System.out.println(student.getName()+"����˯��,������");
				Thread.sleep(36000000);
			}
			catch(InterruptedException e){
				System.out.println(student.getName()+"����ʦ��ѵ��");
				
			}
			System.out.println(student.getName()+"��ʼ����");
			
		}
		else if(Thread.currentThread()==teacher){
			for(int i=1;i<=3;i++){
				System.out.println("�Ͽ�!");
				try{Thread.sleep(500);
				}
				catch(InterruptedException e){}
				
			}
			student.interrupt();
		}
	}

}
