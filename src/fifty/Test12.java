package fifty;

public class Test12 {
	public static void main(String args[]){
		double b=2,c=0,sum=0;
for(int i=1;i<=20;i++){
	c=b/i;
	sum+=c;
     b+=i;
     System.out.println(sum);
}

}
}