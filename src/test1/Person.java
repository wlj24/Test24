package test1;

public class Person {
	public Person(){
		System.out.println("person的无参数构造器");
	}
	{
		System.out.println("person第二个初始化块");
	}
	{
		int a=6;
		if(a>4){
			System.out.println("初始化快，6>4");
		}
		System.out.println("初始化块");
	}
	
	
	public static void main(String args[]){
		new Person();
	}
}
