package thread;

public class Hello1 extends Thread{
	public Hello1(String name) {
		super(name);
	}
	public void run() {
        for (int i = 0; i < 7; i++) {
            if (count > 0) {
                System.out.println(Thread.currentThread().getName()+"正在买票" + count--);
            }
        }
    }
	 public static void main(String[] args) {
	        Hello1 h1 = new Hello1("1号窗口");
	        Hello1 h2 = new Hello1("2号窗口");
	        Hello1 h3 = new Hello1("3号窗口");
	        h1.start();
	        h2.start();
	        h3.start();
}
	 private int count=5;
}