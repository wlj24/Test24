package jihe;

import java.util.HashSet;
import java.util.Set;

public class TestSet {
public static void main(String[] args){
	Set books=new HashSet();
	books.add(new String("java"));
	boolean result=books.add(new String("java"));
	books.add("java");
	System.out.println(books);
	System.out.println(result);
}
}
