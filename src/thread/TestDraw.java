package thread;

public class TestDraw {
public static void main(String[] args){
	Account acct=new Account("1234567",0);
	new DrawThread("ȡǮ��",acct,800).start();
	
	new DepositThread("�����j",acct,800).start();
	new DepositThread("�����y",acct,800).start();
	new DepositThread("�����z",acct,800).start();
}
}
