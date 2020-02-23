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
		System.out.println(getName()+"È¡Ç®³É¹¦£¡ÍÂ³ö³®Æ±"+drawAmount);
	try{
			Thread.sleep(1);
		}catch(InterruptedException ex){
			ex.printStackTrace();
		}
	account.setBalance(account.getBalance()-drawAmount);
	System.out.println("Óà¶î£º"+account.getBalance());
	}
	else{
		System.out.println(getName()+"È¡Ç®Ê§°Ü£¡Óà¶î²»×ã£¡");
	}
}*/
	for(int i=1;i<100;i++){
	account.draw(drawAmount);
	}
}
}
