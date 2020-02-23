package jihe;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListTest {
	public static void main(String args[]){
		List<String> a=new LinkedList<String>();
		a.add("an");
		a.add("bn");
		a.add("cn");
		List<String> b=new LinkedList<String>();
		b.add("dn");
		b.add("en");
		b.add("rn");
		b.add("qn");
		ListIterator<String> aIter=a.listIterator();
	Iterator<String> bIter=b.iterator();
		while(bIter.hasNext()){
			if(aIter.hasNext()) aIter.next();
			aIter.add(bIter.next());
		}
		System.out.println(a);
		bIter=b.iterator();
		while(bIter.hasNext()){
			bIter.next();
			if(bIter.hasNext()){
				bIter.next();
				bIter.remove();
			}
		}
		System.out.println(b);
		a.removeAll(b);
		System.out.println(a);
			
		
	}

}
