package designPattern.Decorator;

public class PersonFod extends Person{
    private Person person;



    public PersonFod(Person person){
        this.person=person;
    }

    @Override
    public void eat() {
        person.eat();

    }
}
