package test1;

public class SubClass extends BaseClass{
	public String book="java";
	public void test(){
		System.out.println("子类覆盖父类的方法");
	}
	public void sub(){
		System.out.println("子类的普通方法");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
BaseClass base=new BaseClass();
System.out.println(base.book);
base.base();
base.test();
SubClass sb=new SubClass();
System.out.println(sb.book);
sb.test();
sb.sub();
BaseClass bb=new SubClass();
System.out.println(bb.book);
bb.test();
bb.base();


	}
}
class BaseClass{
	public int book=6;
	public void base(){
		System.out.println("父类的普通方法");
	}
	public void test(){
		System.out.println("父类被覆盖的方法");
	}
	
}
