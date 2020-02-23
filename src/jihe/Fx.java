package jihe;

import java.util.ArrayList;
import java.util.List;

public class Fx {
public static void main(String args[]){
	List<Course> l=new ArrayList<Course>();
	Course c=new Course("cs",1);
	Course d=new Course("dnf",2);
	l.add(c);
	l.add(d);
	Ccourse b=new Ccourse();
	b.id=1;
	b.name="dd";
	l.add(b);
	
	for(Course Co:l){
		Course	C=Co;
		System.out.println(C.id+C.name);
		
	}
	
	
}
}
