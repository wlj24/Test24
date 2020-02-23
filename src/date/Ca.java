package date;

import java.util.Calendar;

public class Ca {


public static void main(String args[]){
	Calendar c=Calendar.getInstance();
	System.out.println(c.get(Calendar.YEAR));
	System.out.println(c.get(Calendar.MONTH));
	System.out.println(c.get(Calendar.DATE));
	System.out.println(c.get(Calendar.HOUR)+":"+c.get(Calendar.MINUTE)+":"+c.get(Calendar.SECOND));
}
}
