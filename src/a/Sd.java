package a;

import java.math.BigDecimal;

public class Sd {
public static void main(String args[]){
	String b1="1";
	String b2="2";
	double b=1;
	String a=b+"";
	System.out.println(a.length());
	if(a.indexOf(".0")==a.length()-2){
		a=a.substring(0,a.length()-2);
	}
	System.out.println(a);
	BigDecimal a1=new BigDecimal(b1);
	BigDecimal a2=new BigDecimal(b2);
	System.out.println(a1);
	
	System.out.println(a1.divide(a2,6,BigDecimal.ROUND_HALF_UP).doubleValue());
	
	
	//System.out.println(b1*b2);
	}
}