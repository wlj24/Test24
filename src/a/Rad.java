package a;

import java.util.Random;

public class Rad {
 static int x;
public static void main(String args[]){
	while(true){
	int y=10;
	Random r=new Random();
	x=r.nextInt(y);
	x=Math.abs(r.nextInt()%y);
	System.out.println(x);
	}
}
}
