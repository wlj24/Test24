package a;

public class ys {
	public static void main(String args[]){
	int a,i,sum;
	for(i=1;i<=1000;i++){
		sum=0;
	for(a=1;a<i;a++){
	if(i%a==0){
	sum=sum+a;
	}
	}
	if(i==sum){
		System.out.println(i+"ÊÇÍêÊý");
	}
	}
	
}
}
