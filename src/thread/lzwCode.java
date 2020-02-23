package thread;
class MyThread implements Runnable{
	 
    private  int ticket = 5;  //5张票
    public void run() {
        while (true) {
            synchronized(this) {
                if (this.ticket > 0) {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println(Thread.currentThread().getName() + "正在卖票" + this.ticket--);
                }
            }
        }
    }
}
public class lzwCode {
	 public static void main(String [] args) {
	        MyThread my = new MyThread();
	        new Thread(my, "1号窗口").start();
	        new Thread(my, "2号窗口").start();
	        new Thread(my, "3号窗口").start();
	    }
}
