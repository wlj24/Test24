package jihe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ListTest {
public List courseToSelect;
public ListTest(){
	this.courseToSelect=new ArrayList();	
}
public void add(){
	Course c=new Course("c����",1);
	courseToSelect.add(c);
	Course c1=(Course)courseToSelect.get(0);
	System.out.println("����˿γ̣�"+c1.id+" "+c1.name);
	Course c2=new Course("ss",2);
	courseToSelect.add(1,c2);
	Course C2=(Course)courseToSelect.get(1);
	System.out.println(C2.id+C2.name);
	Course[] course={new Course("��ɢ ��ѧ",3),new Course("jvaa",4)};
	courseToSelect.addAll(Arrays.asList(course));
    Course c3=(Course)courseToSelect.get(2);
    Course c4=(Course)courseToSelect.get(3);
    System.out.println(c3.id+c3.name);
    System.out.println(c4.id+c4.name);
}
public void testGet(){
	int size=courseToSelect.size();
	System.out.println("�����¿γ̿ɹ�ѡ��");
	for(int i=0;i<size;i++){
		Course c=(Course)courseToSelect.get(i);
		System.out.println(c.id+c.name);
	}
}
public void testI(){
	System.out.println("��������");
	Iterator it=courseToSelect.iterator();
	while(it.hasNext()){
		Course c=(Course)it.next();
		System.out.println(c.id+c.name);
	}
}
public void remove(){
	Course cr=(Course)courseToSelect.get(2);
	courseToSelect.remove(cr);
	courseToSelect.remove(2);
	testI();
	
}
public void mod(){
	courseToSelect.set(1,new Course("ddddd",1));
}
public void cont(){
	Course c=(Course)courseToSelect.get(0);
	System.out.println("ȡ�ÿγ�"+c.name);
	System.out.println("�Ƿ�����γ�"+c.name+courseToSelect.contains(c));
	System.out.println("������γ�����:");
	Scanner s=new Scanner(System.in);
	String name=s.next();
	Course c2=new Course();
	c2.name=name;
	System.out.println("ȡ�ÿγ�"+c2.name);
	System.out.println("�Ƿ�����γ�"+c2.name+courseToSelect.contains(c2));
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ListTest l=new ListTest();
l.add();
l.testGet();
l.testI();
l.mod();
l.testI();
l.remove();
l.cont();
	}
	

}
