package a;
import java.util.*;
public class k {
	public static void main(String args[]){
	Scanner reader=new Scanner(System.in);
	double sum=0;
	int m=0;
	while(reader.hasNextDouble()){
		double x=reader.nextDouble();
		m=m+1;
		sum=sum+x;
	}
	System.out.printf("%d������Ϊ%f\n",m,sum);
	System.out.printf("%d������ƽ��ֵ��%f\n", m,sum/m);
	}
}