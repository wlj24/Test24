package ali.reflect;


import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by wlj on 2019/1/27.
 */
public class Demo extends DemoFather{
    static {
        Method method[]=Demo.class.getMethods();
        for(Method method1:method){
            System.out.println(method1);
        }
        System.out.println("私有方法");
        Method method2[]=Demo.class.getDeclaredMethods();
        for(Method method1:method2){
            System.out.println(method1);
        }
        System.out.println("属性");
        Field field[]=Demo.class.getFields();
        for(Field field1:field){
            System.out.println(field1);
        }

        System.out.println("私有属性");
        Field field2[]=Demo.class.getDeclaredFields();
        for(Field field3:field2){
            System.out.println(field3);
        }
    }
    public static Demo demo=null;
    private int a;
    private String b;
    private Demo(){
        System.out.println("实力化对象");
    }

    public void setA(int a){
        this.a=a;
    }

    public int getA(){
        return a;
    }
    public Demo(int a){
      this.a=a;
        System.out.print(a);
    }
//    public   static  Demo getInstance(){
//        if(demo==null) {
//            synchronized (Demo.class) {
//                if(demo==null) {
//                    for (int i = 0; i < 10000000; i++) {
//
//                    }
//                    demo = new Demo();
//                }
//            }
//        }
//        return demo;
//    }

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException {
//        Date d=new Date();
//        System.out.println(d.getClass());
        DemoFather demoFather=new Demo();
        demoFather.say();
        Class c=Demo.class;
        Package pa=c.getPackage();
        System.out.println(pa.getName());
        Class d=c.getSuperclass();
        System.out.println(d.getName());
        Constructor[] constructors=c.getDeclaredConstructors();
        for(Constructor constructor:constructors){
            System.out.println(constructor);
        }
        try {
            Constructor constructor=c.getConstructor(int.class);
            Demo demo1= (Demo) constructor.newInstance(3);
            Constructor constructor1=c.getDeclaredConstructor();
            Demo demo2= (Demo) constructor1.newInstance();
            int a=2;
            String methodName="setA";
            Method method=c.getDeclaredMethod(methodName,int.class);
            method.invoke(demo2,a);
            String methodName1="getA";
            Method getMethod=c.getDeclaredMethod(methodName1);
            System.out.println("11****************"+getMethod.invoke(demo2));
            Field field=c.getDeclaredField("a");
            field.set(demo2,22222);
            System.out.println(field.get(demo2));
            Field field2=c.getDeclaredField("b");
            field2.set(demo2,"22222kkkkkkkkkkkkkkkk");
            System.out.println(field2.get(demo2));
            Class s=Son.class;
            Constructor constructor2=s.getDeclaredConstructor();
            Son s1= (Son) constructor2.newInstance();
            Field field1=s.getDeclaredField("name");
            field1.setAccessible(true);
            field1.set(s1,"wlj");
            System.out.println(field1.get(s1));
            Method method1=s.getDeclaredMethod("getName");
            method1.setAccessible(true);
            System.out.println(method1.invoke(s1));
            System.out.println(demo2.a);
            System.out.println(demo1.a);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
//        System.out.println(c);
//        Class c1=Class.forName("ali.reflect.Demo");
//        Demo o= (Demo) c1.newInstance();
//        o.say();
//        System.out.println(o.toString());
//        System.out.println(c1.getName());

        for(int i=0;i<4;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                  //  Demo.getInstance().say();
                }
            }).start();
        }



    }



    public void say(){
        System.out.println("ss");
    }

    @Override
    public void say1() {
        System.out.println("ss");
    }

    public void action(){

    }


}
