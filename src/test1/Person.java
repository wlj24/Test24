package test1;

public class Person {
	public Person(){
		System.out.println("person���޲���������");
	}
	{
		System.out.println("person�ڶ�����ʼ����");
	}
	{
		int a=6;
		if(a>4){
			System.out.println("��ʼ���죬6>4");
		}
		System.out.println("��ʼ����");
	}
	
	
	public static void main(String args[]){
		new Person();
	}
}
