import java.util.Scanner;


public class Big {
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		System.out.println("请输入第一数");
		int m=sc.nextInt();
	   System.out.println("请输入第二个数"); 
	   int n=sc.nextInt();
	System.out.println( compare(m,n));
	
		
	}
	public static String compare(int a,int b){
		String x="相等";
		String y="不相等";
	if(a==b){
		return x;
	}
	else{
	return y;
	
	}
	}
}
