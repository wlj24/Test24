package fifty;

import java.util.Scanner;

public class Test6 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m=0,n=0,p=0,q=0;
       Scanner s=new Scanner(System.in);
       System.out.println("������һ���ַ���");
       String a=s.nextLine();
       for(int i=0;i<a.length();i++){
    	  char c=a.charAt(i);
    	  if(Character.isDigit(c)) m++;
    	  else if(Character.isLetter(c)) n++;
    	  else if(Character.isWhitespace(c)) p++;
    	  else q++;
    	  
      }
      System.out.println("Ӣ����ĸ������"+n);
      System.out.println("���ָ�����"+m);
      System.out.println("�ո������"+p);
      System.out.println("�����ַ�������"+q);
	}

}
