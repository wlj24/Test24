package test1;


class Creature{
	public Creature(){
		System.out.println("creature���޲ι�����");
	}
}
class Animal extends Creature{
	public Animal(){
		System.out.println("Animal�޲ι�����");
	}
	public Animal(String name){
		System.out.println("Animal��һ�������Ĺ��������ö����nameΪ"+name);
	}
	public Animal(String name,int age){
		this(name);
		System.out.println("Animal�����������Ĺ��������ö����age"+age);
	}
}
public class Wolf extends Animal{
	public Wolf(){
		
		//super("����",3);
		System.out.println("wolf�޲ι�����");
	}
	public static void main(String args[]){
		new Wolf();
	}
}