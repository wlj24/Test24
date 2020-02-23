package test1;

public class Manager extends Employee{
private double bonus;
public void setBonus(double b){
	bonus=b;
}
public Manager(String name, double salary, int year, int month, int day) {
		super(name, salary, year, month, day);
		bonus=0;
		// TODO Auto-generated constructor stub
	}
public double getSalary(){
	double basesalary=super.getSalary();
	return basesalary+bonus;
}
	

}
