package a;

import java.util.Scanner;

public class Mk2 {
	public static void main(String args[]){
		
		int count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("������һ������");
	int	score=s.nextInt();
		System.out.println(score);
		while(score<60){
			count++;
			score=score+1;	
		}
		System.out.println(count);
		
	}

}
