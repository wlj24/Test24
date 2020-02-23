package thread;

public class TestDraw {
public static void main(String[] args){
	Account acct=new Account("1234567",0);
	new DrawThread("取钱者",acct,800).start();
	
	new DepositThread("存款者j",acct,800).start();
	new DepositThread("存款者y",acct,800).start();
	new DepositThread("存款者z",acct,800).start();
}
}
