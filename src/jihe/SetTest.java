package jihe;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class SetTest {
public List<Course> courseToSelect;
public SetTest(){
	courseToSelect=new ArrayList<Course>();
}
public void testAdd(){
	Course c1=new Course("数",1);
	courseToSelect.add(c1);
	Course temp=courseToSelect.get(0);
	Course c2=new Course("dd",2);
	courseToSelect.add(0, c2);
	Course t2=courseToSelect.get(0);
	Course[] c={new Course("ds",3),new Course("ff",4)};
	courseToSelect.addAll(2,Arrays.asList(c));
	Course t3=courseToSelect.get(2);
	Course t4=courseToSelect.get(3);
}
public void testeach(){
	System.out.println("有如下课程可供选择：");
	for(Course s:courseToSelect){
		Course q=s;
		System.out.println(q.id+" "+q.name);
		
	}
}
public void create(){
	System.out.println("请输入课程名称");
	Scanner s=new Scanner(System.in);
	String name=s.next();
	Course c=new Course();
	c.name=name;
	System.out.println("取得课程"+c.name);
	System.out.println("是否包含课程"+c.name+courseToSelect.contains(c));
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
SetTest st=new SetTest();
st.testAdd();
st.testeach();
Student student=new Student(1,"地方");
Scanner co=new Scanner(System.in);
for(int i=0;i<3;i++){
	System.out.println("请输入课程id");
	int cid=co.nextInt();
	for(Course cr:st.courseToSelect){
		if(cr.id==cid){
			student.courses.add(cr);
			
		}
	}
	
}
st.tt(student);
st.create();
	}
public void tt(Student student){
	System.out.println("选择了"+student.courses.size()+"门课程");
	for(Course cr:student.courses){
		System.out.println("选择了"+cr.id+cr.name);
	}
}
}
