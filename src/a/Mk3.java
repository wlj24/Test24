package a;

import java.util.Scanner;

public class Mk3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int classnum=3;
       int studentnum=4;
       int i,j;
       int average;
       int sum=0;
       Scanner s=new Scanner(System.in);
       for(i=1;i<=classnum;i++){
    	   sum=0;
    	   System.out.println("������"+i+"���ͬѧ�ĳɼ�");
    	   for(j=1;j<=studentnum;j++){
    		   System.out.println(j);
    		   int m=s.nextInt();
    		   sum=sum+m;
    	   }
    	   average=sum/studentnum;
    	   System.out.println(i+"���ƽ���ɼ�Ϊ"+average);   
       }
	}

}
