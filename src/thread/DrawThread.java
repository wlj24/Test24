package thread;

public class DrawThread extends Thread{
private Account account;
private double drawAmount;
public DrawThread(String name,Account account,double drawAmount){
	super(name);
	this.account=account;
	this.drawAmount=drawAmount;
}

public void run(){
	/*if(account.getBalance()>=drawAmount){
		System.out.println(getName()+"ȡǮ�ɹ����³���Ʊ"+drawAmount);
	try{
			Thread.sleep(1);
		}catch(InterruptedException ex){
			ex.printStackTrace();
		}
	account.setBalance(account.getBalance()-drawAmount);
	System.out.println("��"+account.getBalance());
	}
	else{
		System.out.println(getName()+"ȡǮʧ�ܣ����㣡");
	}
}*/
	for(int i=1;i<100;i++){
	account.draw(drawAmount);
	}
}
}
