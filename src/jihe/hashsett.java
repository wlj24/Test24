package jihe;

import java.util.HashSet;


class A{
	public boolean equals(Object obj){
		return true;
	}
}
class B{
	public int hashCode(){
		return 1;
	}
}
class C{
	public int hashCode(){
		return 2;
		
	}
	public boolean equals(Object obj){
		return true;
	}
}
public class hashsett {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet books=new HashSet();
		books.add(new A());
		books.add(new A());
		books.add(new B());
		books.add(new B());
		books.add(new C());
		books.add(new C());
		System.out.print(books);
		

	}

}
