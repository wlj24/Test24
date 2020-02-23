package designPattern.Decorator;

public class ExpensivePersonFod extends PersonFod{
    public ExpensivePersonFod(Person person) {
        super(person);
    }

    public void eat(){
        super.eat();
        System.out.println("吃牛排");
    }
}
