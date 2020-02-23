package a;

class fish{
	int weight=1;
}
class lake{
	fish f;
	void setfish(fish s){
		f=s;
	}
	void foodfish(int m){
	f.weight=f.weight+m;
	}
}

public class E {
	public static void main(String args[]){
		fish redfish=new fish();
		System.out.println(redfish.weight);
		lake l=new lake();
		l.setfish(redfish);
		l.foodfish(100);
		System.out.println(redfish.weight);
		System.out.println(l.f.weight);
	}

}
