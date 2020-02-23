package comuter;

import java.util.Scanner;

public class Sc {
	public static void main (String args[]){
		Scanner reader=new Scanner(System.in);
		int sum=0;
		int x=reader.nextInt();
		while(x!=0){
			sum=sum+x;
			x=reader.nextInt();
		}
		System.out.print(sum);
	}

}
