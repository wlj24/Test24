package jihe;

import java.util.Collection;
import java.util.HashSet;

public class Foreach {
	public static void main(String[] args){
		Collection books=new HashSet();
		books.add(new String("javaee"));
		books.add(new String("jaa"));
		books.add(new String("jaa"));
		for(Object obj:books)
		{
			String book=(String)obj;
			System.out.println(book);
			if(book.equals("ad"));
			{
				books.remove(book);
			}
					
		}
		System.out.println(books);
			
	}

}
