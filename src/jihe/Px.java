package jihe;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Px {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
List<Integer> l=new ArrayList<Integer>();
Integer k;
Random radom=new Random();
for(int i=0;i<10;i++){
	do{k=radom.nextInt(100);}
	while(l.contains(k));
	l.add(k);
	System.out.println("成功添加整数"+k);
}
System.out.println("未排序前:");
for(Integer i:l){
	System.out.println(i);
}
System.out.println("排序后");
Collections.sort(l);
for(Integer i:l){
	System.out.println(i);
}
	}

}
