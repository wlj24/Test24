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
	    	  System.out.println("������ѧ��id");
	      Scanner s=new Scanner(System.in);
	      int id=s.nextInt();
	      Student st=students.get(id);
	      if(st==null){
	    	  System.out.println("����ѧ��������");
	    	  String name=s.next();
	    	  Student ss=new Student(id,name);
	    	  students.put(id, ss);
	    	  System.out.println("�ɹ����ѧ��"+ss.name);
	      }else{
	    	  System.out.println("��id�Ѵ���");
	    	  continue;
	      }
		}
	}
	public void cc(){
		Set<Integer> keySet=students.keySet();
		System.out.println("�ܹ��У�"+students.size()+"��ѧ��");
	for(Integer id:keySet){
		Student st=students.get(id);
		if(st!=null){
			System.out.println("ѧ��"+st.name);
		}
	}
	}
	public void remove(){
		while(true){
		System.out.println("������Ҫɾ��ѧ����id");
		Scanner s=new Scanner(System.in);
		int id=s.nextInt();
		Student ss=students.get(id);
		if(ss==null){
			System.out.println("��id������");
			continue;
		}
		else{
			students.remove(id);
			System.out.println("�ɹ�ɾ����"+ss.name);
			break;
		}
		}
	}
	public void testEntrySet(){
		Set<Entry<Integer,Student>> entrySet=students.entrySet();
		for(Entry<Integer,Student> entry:entrySet){
			System.out.println("ȡ�ü���"+entry.getKey());
			System.out.println("��Ӧ��ֵΪ��"+entry.getValue().name);
		}
	}
	public void contains(){
		System.out.println("������ѧ����id");
		Scanner s=new Scanner(System.in);
		int id=s.nextInt();
		System.out.println("�������ѧ��idΪ"+id+",��ѧ���Ƿ����"+students.containsKey(id));
		if(students.containsKey(id)){
			System.out.println("ѧ��Ϊ"+students.get(id).name);
		}
		System.out.println("������Ҫ��ѯѧ��������");
		String name=s.next();
		if(students.containsValue(new Student(null,name)))
			System.out.println(name);
		else
			System.out.println("������");
	}
	public void testmodfi(){
		while(true){
		System.out.println("������Ҫ�޸�ѧ����id");
		Scanner s=new Scanner(System.in);
		int id=s.nextInt();
		Student ss=students.get(id);
		if(ss==null){
			System.out.println("��ѧ��������");
			continue;
		}
		System.out.println("��ǰ��ѧ��id,����Ӧ��ѧ��Ϊ��"+ss.name);
		System.out.println("�������µ�ѧ��������");
		String name=s.next();
		Student ns=new Student(id,name);
		students.put(id, ns);
		System.out.println("�޸ĳɹ�");
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


