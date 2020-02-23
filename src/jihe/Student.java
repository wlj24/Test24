package jihe;

import java.util.HashSet;
import java.util.Set;

public class Student {
public String name;
public Integer age;
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((name == null) ? 0 : name.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (!(obj instanceof Student))
		return false;
	Student other = (Student) obj;
	if (name == null) {
		if (other.name != null)
			return false;
	} else if (!name.equals(other.name))
		return false;
	return true;
}
public Set<Course> courses;
public Student(Integer age,String name){
	this.age=age;
	this.name=name;
	this.courses=new HashSet<Course>();
}
}