package fifty;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s=new Scanner(System.in);
      System.out.println("������ѧ���ɼ���");
      char grade;
      
      int x=s.nextInt();
     /* if(n<0||n>100){System.out.println("��������");}
      else if(n>=90){System.out.println("A");}
      else if(n>=60){System.out.println("B");}
      else{System.out.println("C");}*/
		grade=x>=90?'A':x>=60?'B':'C';
		System.out.println("�ȼ�Ϊ��"+grade);
	}

}
