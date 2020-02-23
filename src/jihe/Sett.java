package jihe;

import java.util.HashSet;
import java.util.Set;

public class Sett {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set books=new HashSet();
		books.add(new String("java"));
		String b=new String("java");
		boolean result=books.add(b);
		System.out.println(result+"-"+books);
		

	}

}
