package thread;

public class ClassR implements Runnable {
	Thread student,teacher;
	ClassR(){
		teacher=new Thread(this);
		student=new Thread(this);
		teacher.setName("王教授");
		student.setName("张三");
			
	}
	public void run(){
		if(Thread.currentThread()==student){
			try{
				System.out.println(student.getName()+"正在睡觉,不听课");
				Thread.sleep(36000000);
			}
			catch(InterruptedException e){
				System.out.println(student.getName()+"被老师教训了");
				
			}
			System.out.println(student.getName()+"开始听课");
			
		}
		else if(Thread.currentThread()==teacher){
			for(int i=1;i<=3;i++){
				System.out.println("上课!");
				try{Thread.sleep(500);
				}
				catch(InterruptedException e){}
				
			}
			student.interrupt();
		}
	}

}
