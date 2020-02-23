package jihe;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Hsm {
	public HashMap<Integer,Student> students;
	public Hsm(){
		this.students=new HashMap<Integer,Student>();
	}
	public void put(){
		for(int i=0;i<3;i++){
	    	  System.out.println("请输入学生id");
	      Scanner s=new Scanner(System.in);
	      int id=s.nextInt();
	      Student st=students.get(id);
	      if(st==null){
	    	  System.out.println("请入学生姓名：");
	    	  String name=s.next();
	    	  Student ss=new Student(id,name);
	    	  students.put(id, ss);
	    	  System.out.println("成功添加学生"+ss.name);
	      }else{
	    	  System.out.println("该id已存在");
	    	  continue;
	      }
		}
	}
	public void cc(){
		Set<Integer> keySet=students.keySet();
		System.out.println("总共有："+students.size()+"个学生");
	for(Integer id:keySet){
		Student st=students.get(id);
		if(st!=null){
			System.out.println("学生"+st.name);
		}
	}
	}
	public void remove(){
		while(true){
		System.out.println("请输入要删除学生的id");
		Scanner s=new Scanner(System.in);
		int id=s.nextInt();
		Student ss=students.get(id);
		if(ss==null){
			System.out.println("该id不存在");
			continue;
		}
		else{
			students.remove(id);
			System.out.println("成功删除了"+ss.name);
			break;
		}
		}
	}
	public void testEntrySet(){
		Set<Entry<Integer,Student>> entrySet=students.entrySet();
		for(Entry<Integer,Student> entry:entrySet){
			System.out.println("取得键："+entry.getKey());
			System.out.println("对应的值为："+entry.getValue().name);
		}
	}
	public void contains(){
		System.out.println("请输入学生的id");
		Scanner s=new Scanner(System.in);
		int id=s.nextInt();
		System.out.println("您输入的学生id为"+id+",该学生是否存在"+students.containsKey(id));
		if(students.containsKey(id)){
			System.out.println("学生为"+students.get(id).name);
		}
		System.out.println("请输入要查询学生的姓名");
		String name=s.next();
		if(students.containsValue(new Student(null,name)))
			System.out.println(name);
		else
			System.out.println("不存在");
	}
	public void testmodfi(){
		while(true){
		System.out.println("请输入要修改学生的id");
		Scanner s=new Scanner(System.in);
		int id=s.nextInt();
		Student ss=students.get(id);
		if(ss==null){
			System.out.println("该学生不存在");
			continue;
		}
		System.out.println("当前该学生id,所对应的学生为："+ss.name);
		System.out.println("请输入新的学生姓名：");
		String name=s.next();
		Student ns=new Student(id,name);
		students.put(id, ns);
		System.out.println("修改成功");
		break;
	}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Hsm h=new Hsm();
      h.put();
      h.cc();
      h.remove();
      h.testEntrySet();
      h.testmodfi();
      h.testEntrySet();
      h.contains();
      }
	}


