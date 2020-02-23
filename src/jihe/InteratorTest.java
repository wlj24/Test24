package jihe;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;



public class InteratorTest {
		public static void main(String args[]){
			Collection books=new HashSet();
			books.add("javaee");
			books.add("java");
			books.add("Andoid");
			for(Object obj:books)
			{
				String book=(String)obj;
				System.out.println(book);
				if(book.equals("Android")){
					
				}
			}
			Iterator it=books.iterator();
			
			while(it.hasNext()){
				String book=(String)it.next();
				System.out.println(book);
				if(book.equals("java"))
				{
					books.remove(book);

				}

			}
			System.out.println(books);
			

		}
}
