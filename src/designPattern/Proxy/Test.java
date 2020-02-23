package designPattern.Proxy;

public class Test {
    public static void main(String[] args) {
//        Worker proxy=new Proxy(new RealSubject());
//        proxy.work();
        Worker worker= (Worker) java.lang.reflect.Proxy.newProxyInstance(Test.class.getClassLoader(),new Class[]{Worker.class},new JdkProxy(new RealSubject()));
        worker.work();
        worker.hellO();
    }
}
