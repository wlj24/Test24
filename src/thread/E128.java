package thread;

public class E128 {
	public static void main(String[] args){
		TicketHouse officer=new TicketHouse();
		Thread zhangfei,wo;
		zhangfei=new Thread(officer);
		zhangfei.setName("�ŷ�");
		wo=new Thread(officer);
		wo.setName("��");
		zhangfei.start();
		wo.start();
	}
		
	

}
