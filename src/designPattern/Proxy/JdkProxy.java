package designPattern.Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class JdkProxy implements InvocationHandler {
    private RealSubject realSubject;
    public JdkProxy(RealSubject realSubject1){
        this.realSubject=realSubject1;

    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("before");
        Object result=method.invoke(realSubject,args);
        System.out.println("after");
        return result;
    }
}
