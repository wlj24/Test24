package comuter;


class Vehicle{
	double speed;
	int power;
	public void speedUp(int s){
		speed=speed+s;
		if(speed>200){
			speed=200;
		}
	}
	public void speedDown(int s){
		speed=speed-s;
		if(speed<0){
			speed=0;
		}
	}
	public double getSpeed(){
		return speed;
	}
	public void brake(){
		speed=0;
	}
}

public class User {
	public static void main(String args[]){
	Vehicle v=new Vehicle();
	v.getSpeed();
	System.out.println("初始速度:"+v.speed);
	v.speedUp(195);
	System.out.println("加速后:"+v.speed);
	v.speedDown(95);
	System.out.println("减速后:"+v.speed);
	v.brake();
	System.out.println("刹车后:"+v.speed);
	}
}
