package designPattern.Proxy;

public class Proxy implements Worker{
    private RealSubject realSubject;
    public Proxy(RealSubject subject){
        this.realSubject=subject;
    }
    @Override
    public void work() {
        System.out.println("begin");
        realSubject.work();
        System.out.println("after");
    }


    @Override
    public void hellO() {

    }
}
