package comuter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class CollectionTest {
	public static void main(String args[]){
		Collection c=new ArrayList();
		c.add("�����");
		c.add(6);
		System.out.println(c.size());
		c.remove(6);
		System.out.println(c.size());
		System.out.println(c.contains("�����"));
		c.add("��");
		System.out.println(c);
		Collection books=new HashSet();
		books.add("�����");
		System.out.println(c.containsAll(books));
		c.removeAll(books);
		System.out.println(c);
		c.clear();
		System.out.println(c);
		
	}

}
