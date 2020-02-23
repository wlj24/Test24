package thread;

public class Account {
private String accountNo;
private double balance;
private boolean flag=false;
public Account(){
	
}
public Account(String accountNo,double balance){
	this.accountNo=accountNo;
	this.balance=balance;
}
public String getAccountNo() {
	return accountNo;
}
public void setAccountNo(String accountNo) {
	this.accountNo = accountNo;
}
public double getBalance() {
	return balance;
}
public void setBalance(double balance) {
	this.balance = balance;
}
public synchronized void draw(double drawAmount){
	try{
		if(!flag){
			wait();
		}
		else{
			System.out.println(Thread.currentThread().getName()+"ȡǮ��"+drawAmount);
			balance-=drawAmount;
			System.out.println("�˻����Ϊ��"+balance);
			flag=false;
			notifyAll();
		}
	}catch(InterruptedException ex){
		ex.printStackTrace();
	}
	/*if(balance>=drawAmount){
		System.out.println(Thread.currentThread().getName()+"ȡǮ�ɹ����³���Ʊ"+drawAmount);
		try{
			Thread.sleep(1);
		}catch(InterruptedException ex){
			ex.printStackTrace();
		}
		balance-=drawAmount;
		System.out.println("\t���Ϊ��"+balance);
	}
	else{
		System.out.println(Thread.currentThread().getName()+"ȡǮʧ�ܣ�����");
	}*/
}
public synchronized void deposit(double depositAmount){
	try{
		if(!flag){
			wait();
		}else{
			System.out.println(Thread.currentThread().getName()+"���"+depositAmount);
			balance+=depositAmount;
			flag=true;
			notifyAll();
		}
	}catch(Exception e){
		e.printStackTrace();
	}
}
public int hasCode(){
	return accountNo.hashCode();
}
public boolean equals(Object obj){
	if(obj!=null&&obj.getClass()==Account.class){
		Account target=(Account)obj;
		return target.getAccountNo().equals(accountNo);
	}
	return false;
	
}

}
