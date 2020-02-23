package jihe;

import java.util.ArrayList;
import java.util.List;



public class LISST {

	public static void main(String[] args) {
	
		// TODO Auto-generated method stub
		List books=new ArrayList();
		books.add(new String("dd"));
		books.add(new String("jj"));
		books.add(new String("ad"));
		System.out.println(books);
		
		books.add(1,new String("ajax"));
		for(int i=0;i<books.size();i++){
			System.out.println(books.get(i));
		}
		books.remove(2);
		System.out.println(books);
		System.out.println(books.indexOf(new String("ajax")));
		books.set(1, new String("java"));
		System.out.println(books);
		System.out.println(books.subList(1, 2));


		System.out.println(6 >> 1);
		
		
		
		

	}

}
