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
	System.out.println("�ɹ��������"+k);
}
System.out.println("δ����ǰ:");
for(Integer i:l){
	System.out.println(i);
}
System.out.println("�����");
Collections.sort(l);
for(Integer i:l){
	System.out.println(i);
}
	}

}
