package designPattern.Decorator;

public class Client {
    public static void main(String[] args) {
        Person normalPerson=new NormalPerson();
        PersonFod personFod=new ExpensivePersonFod(normalPerson);
        personFod.eat();
    }
}
