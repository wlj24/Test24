package thread;

public class Hello1 extends Thread{
	public Hello1(String name) {
		super(name);
	}
	public void run() {
        for (int i = 0; i < 7; i++) {
            if (count > 0) {
                System.out.println(Thread.currentThread().getName()+"������Ʊ" + count--);
            }
        }
    }
	 public static void main(String[] args) {
	        Hello1 h1 = new Hello1("1�Ŵ���");
	        Hello1 h2 = new Hello1("2�Ŵ���");
	        Hello1 h3 = new Hello1("3�Ŵ���");
	        h1.start();
	        h2.start();
	        h3.start();
}
	 private int count=5;
}