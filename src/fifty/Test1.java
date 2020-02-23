package fifty;

public class Test1 {
	public static void main(String args[]){
		System.out.println("第1月有1对兔子");
		System.out.println("第2月有1对兔子");
		int a=1,b=1,c;
		for(int i=3;i<10;i++){
			c=a+b;
			a=b;
			b=c;
		System.out.println("第"+i+"月有"+c+"对兔子");	
		}
	}

}
