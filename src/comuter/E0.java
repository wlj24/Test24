package comuter;

public class E0 {
	public static void main(String args[]){
		House house=new House();
		house.setWater(10);
		Thread dog,cat;
		dog=new Thread(house);
		cat=new Thread(house);
		dog.setName("��");
		cat.setName("è");
		dog.start();
		cat.start();
	}

}
