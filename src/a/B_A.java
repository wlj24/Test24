package a;


class p{
	int n;
	static int sum=0;
	void setN(int n){
		this.n=n;
		
	}
	int getSum(){
		for(int i=1;i<=n;i++)
			sum=sum+i;
		return sum;
	}
}

public class B_A {
	public static void main(String args[]){
		p b1=new p(),b2=new p();
		b1.setN(1);
		b2.setN(1);
		int s1=b1.getSum();
		int s2=b2.getSum();
		System.out.println(s1+s2);
		
	}

}
