package test1;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;

public class Employee {
private String name;
private double salary;
private Date hireDay;
public Employee(String name,double salary,int year,int month,int day){
	this.name=name;
	this.salary=salary;
	GregorianCalendar a =  new GregorianCalendar(year,month-1,day);
	
	hireDay=a.getTime();
}
	public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public double getSalary() {
	return salary;
}

public void setSalary(double salary) {
	this.salary = salary;
}

public Date getHireDay() {
	return hireDay;
}

public void setHireDay(Date hireDay) {
	this.hireDay = hireDay;
}
public void raise(double bp){
	double raise=salary*bp/100;
	salary+=raise;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Employee[] e=new Employee[3];
e[0]=new Employee("w",7500,1987,12,15);
e[1]=new Employee("l",7500,1987,12,15);
e[2]=new Employee("j",1200,1987,12,15);
for(Employee m:e)
	m.raise(5);
SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss"); 
	for(Employee m:e)
		System.out.println("姓名:"+m.getName()+" 薪水:"+m.getSalary()+"日期: "+format.format(m.getHireDay()));
	}

}
