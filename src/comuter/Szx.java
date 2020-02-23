package comuter;



class lry{
	void crySpeak(String s){
		System.out.println(s);
	}
}
class people extends lry{
	void computer(int a,int b){
		int c=a*b;
		System.out.println(c);
	}
	void crySpeak(String s){
		System.out.println("***"+s);
	}
}
public class Szx {
	public static void main(String args[]){
		lry m=new people();
		m.crySpeak("I");
		people people=(people)m;
		people.computer(10, 10);
		
		
	}

}
