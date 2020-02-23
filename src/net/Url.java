package net;

import java.net.URLDecoder;
import java.net.URLEncoder;

public class Url {
public static void main(String[] args) throws Exception{
	String keyWord=URLDecoder.decode("%B7%E8%BF%F1java","GBK");
	System.out.println(keyWord);
	String urlstr=URLEncoder.encode("·è¿ñjava","UTF-8");
	System.out.println(urlstr);
	
}
}
