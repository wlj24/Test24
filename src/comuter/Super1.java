package comuter;



class s{
	int number;
	String name;
	s(int number,String name){
		this.name=name;
		this.number=number;
		System.out.println(name+number);
	}
}
class u extends s{
	boolean 婚否;
	u(int number,String name, boolean b){
super(number,name);
		婚否=b;
		System.out.println("婚否"+婚否);
	
}
}

public class Super1 {
	public static void main(String args[]){
		u w=new u(1,"瓦",false);
	}

	

}
