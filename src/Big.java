import java.util.Scanner;


public class Big {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("�������һ��");
		int m=sc.nextInt();
	   System.out.println("������ڶ�����"); 
	   int n=sc.nextInt();
	System.out.println( compare(m,n));
	
		
	}
	public static String compare(int a,int b){
		String x="���";
		String y="�����";
	if(a==b){
		return x;
	}
	else{
	return y;
	
	}
	}
}
