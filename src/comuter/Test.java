package comuter;

class CPU{
	int speed;
	public void setSpeed(int m){
		speed=m;
	}
	public int getSpeed(){
		return speed;
	}
}
class HardDisk{
	int amount;
	public void setAmount(int m){
		amount=m;
	}
	public int getAmount(){
		return amount;
	}
}
class PC{
	CPU cpu;
	HardDisk HD;
public void setCPU(CPU c){
	cpu=c;
}
public void setHardDisk(HardDisk h){
	HD=h;
}
public void show(){
	System.out.println("cpu的速度:"+cpu.speed);
	System.out.println("硬盘的容量:"+HD.amount);
	
}
}


public class Test {
	public static void main(String args[]){
	CPU cpu=new CPU();
	cpu.setSpeed(2200);
	HardDisk disk=new HardDisk();
	disk.setAmount(200);
	PC pc=new PC();
	pc.setCPU(cpu);
	pc.setHardDisk(disk);
	pc.show();
	
	}

}
