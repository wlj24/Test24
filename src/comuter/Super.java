package comuter;



class Sum{
	int n;
	float f() {
		float sum=0;
		for(int i=1;i<=n;i++)
			sum=sum+i;
			return sum;
		}
		
	}

class average extends Sum{
	int n;
	float f(){
		float c;
		super.n=n;
		c=super.f();
		return c/n;
	}
	float g(){
		float c;
		c=super.f();
		return c/2;
	}
	
}
public class Super {
	public static void main(String args[]){
		average a=new average();
		a.n=100;
		float r2=a.g();
		float r1=a.f();
		
		System.out.println(r1);
		System.out.println(r2);
	}

}
