package fifty;

import java.util.Scanner;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Scanner s=new Scanner(System.in);
      System.out.println("请输入学生成绩：");
      char grade;
      
      int x=s.nextInt();
     /* if(n<0||n>100){System.out.println("输入有误");}
      else if(n>=90){System.out.println("A");}
      else if(n>=60){System.out.println("B");}
      else{System.out.println("C");}*/
		grade=x>=90?'A':x>=60?'B':'C';
		System.out.println("等级为："+grade);
	}

}
