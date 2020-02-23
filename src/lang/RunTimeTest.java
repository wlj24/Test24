package lang;

/**
 * Created by wlj on 2018/11/25.
 */
public class RunTimeTest {
    public static void main(String[] args) throws  Exception{
        Runtime runtime=Runtime.getRuntime();
//        Process p= runtime.exec("calc.exe");
        System.out.println("最大内存："+convertM(runtime.maxMemory())+"M");
        System.out.println("总内存："+convertM(runtime.totalMemory())+"M");
        System.out.println("空余内存："+convertM(runtime.freeMemory())+"M");

        String a="";
        for(int i=0;i<10000;i++){
            a+=a;
            Object o=new Object();
                   System.out.println("空余内存1："+convertM(runtime.freeMemory())+"M");
        }

        System.out.println("最大内存1："+convertM(runtime.maxMemory())+"M");
        System.out.println("总内存1："+convertM(runtime.totalMemory())+"M");

        runtime.gc();
        System.out.println("最大内存2："+convertM(runtime.maxMemory())+"M");
        System.out.println("总内存2："+convertM(runtime.totalMemory())+"M");
        System.out.println("空余内存2："+convertM(runtime.freeMemory())+"M");
    }

    public static double convertM(long menory){
        return menory/1024/1024;
    }
}
