package test1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Rl {
public static void main(String args[]) throws ParseException{
	Calendar c=Calendar.getInstance();
	   SimpleDateFormat myFmt=new SimpleDateFormat("yyyy��MM��dd�� HHʱmm��ss��");
	  System.out.println(c.getTime());
	  System.out.println(myFmt.format(c.getTime()));
	System.out.println(c.get(Calendar.YEAR));
	System.out.println(c.get(Calendar.MONTH));
	System.out.println(c.get(Calendar.DATE));
	Date d=c.getTime();
	 System.out.println(myFmt.format(d));
	System.out.println(d);
	Calendar c1=Calendar.getInstance();
//	c1.setTime(d);
	System.out.println(c1);
	SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
    //���ڵ��ַ�����ת��
    String today = df.format(new Date());
    System.out.println(today);
    //�ַ��������ڵ�ת��
    Date date = df.parse("2009-06-12 02:06:37");
    System.out.println(date);
    System.out.println(df.format(new Date()));
    GregorianCalendar a =  new GregorianCalendar();
    SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"); 
    
    System.out.println("��ǰʱ�䣺"+format.format(a.getTime()));
    
    a.add(Calendar.HOUR_OF_DAY, -1);
    System.out.println("һСʱǰ��"+format.format(a.getTime()));
    
    a =  new GregorianCalendar();
    a.add(Calendar.DAY_OF_MONTH, -1);
    System.out.println("һ �� ǰ��"+format.format(a.getTime()));
    
    a =  new GregorianCalendar();
    a.add(Calendar.MONTH, -1);
    System.out.println("һ �� ǰ��"+format.format(a.getTime()));
    
    a =  new GregorianCalendar();
    a.add(Calendar.MONTH, 477441);
    System.out.println("һ �� ��"+format.format(a.getTime())); 
	
}
}
