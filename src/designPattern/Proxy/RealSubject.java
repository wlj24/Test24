package designPattern.Proxy;

public class RealSubject implements Worker{

    @Override
    public void work() {
        System.out.println("working");
    }

    @Override
    public void hellO() {
        System.out.println("hello");
    }
}
