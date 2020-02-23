package test1;


class Creature{
	public Creature(){
		System.out.println("creature的无参构造器");
	}
}
class Animal extends Creature{
	public Animal(){
		System.out.println("Animal无参构造器");
	}
	public Animal(String name){
		System.out.println("Animal带一个参数的构造器，该动物的name为"+name);
	}
	public Animal(String name,int age){
		this(name);
		System.out.println("Animal带两个参数的构造器，该动物的age"+age);
	}
}
public class Wolf extends Animal{
	public Wolf(){
		
		//super("狐狸",3);
		System.out.println("wolf无参构造器");
	}
	public static void main(String args[]){
		new Wolf();
	}
}