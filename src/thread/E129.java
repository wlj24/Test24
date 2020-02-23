package thread;

public class E129 {
	public static void main(String args[]){
		Threadjoin a=new Threadjoin();
		Thread customer=new Thread(a);
		Thread cakemaker=new Thread(a);
		customer.setName("¹Ë¿Í");
		cakemaker.setName("µ°¸âÊ¦");
		a.setJoinThread(cakemaker);
		customer.start();
	}

}
