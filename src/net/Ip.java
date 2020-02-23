package net;
import java.io.IOException;
import java.net.InetAddress;
import java.net.UnknownHostException;
public class Ip {
public static void main(String args[]) throws Exception{
	InetAddress ip=InetAddress.getByName("www.baidu.com");
	InetAddress loacl=InetAddress.getLocalHost();
	System.out.println("crazyit «∑ÒµΩ¥Ô"+ip.isReachable(2000));
	System.out.println(ip.getHostAddress());
	System.out.println(loacl.getHostAddress());
	InetAddress loacl1=InetAddress.getByAddress(new byte[]{127,0,0,1});
	System.out.println(loacl1.isReachable(5000));
	
}
}
