package fifty;

import java.util.Scanner;

public class Test6 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=0,n=0,p=0,q=0;
       Scanner s=new Scanner(System.in);
       System.out.println("请输入一行字符：");
       String a=s.nextLine();
       for(int i=0;i<a.length();i++){
    	  char c=a.charAt(i);
    	  if(Character.isDigit(c)) m++;
    	  else if(Character.isLetter(c)) n++;
    	  else if(Character.isWhitespace(c)) p++;
    	  else q++;
    	  
      }
      System.out.println("英文字母个数："+n);
      System.out.println("数字个数："+m);
      System.out.println("空格个数："+p);
      System.out.println("其他字符个数："+q);
	}

}
