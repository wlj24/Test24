package fifty;

public class Test1 {
	public static void main(String args[]){
		System.out.println("��1����1������");
		System.out.println("��2����1������");
		int a=1,b=1,c;
		for(int i=3;i<10;i++){
			c=a+b;
			a=b;
			b=c;
		System.out.println("��"+i+"����"+c+"������");	
		}
	}

}
