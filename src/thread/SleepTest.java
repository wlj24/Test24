package thread;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SleepTest {
public static void main(String argd[]) throws InterruptedException, ParseException{
	for(int i=0;i<10;i++){
		SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd");
		Date d=new Date();
		System.out.println("��ǰʱ�䣺"+d);
		Thread.sleep(1000);
	}
}
}
