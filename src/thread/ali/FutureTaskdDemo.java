package thread.ali;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * Created by wlj on 2018/12/16.
 */
public class FutureTaskdDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        MyThread mt=new MyThread();
        FutureTask<String> task=new FutureTask<String>(mt);
        FutureTask<String> taskB=new FutureTask<String>(mt);
       FutureTask<String> taskC=new FutureTask<String>(mt);
        new Thread(task,"a").start();
        new Thread(taskB,"b").start();
        new Thread(taskC,"c").start();
        System.out.println(task.get());
        System.out.println(taskB.get());
        System.out.println(taskC.get());
    }

}



class MyThread implements Callable<String>{
    private boolean flag=false;
    @Override
    public String call() throws Exception {
        synchronized (this){
            if(this.flag==false){

                this.flag=true;
                return Thread.currentThread().getName()+"抢答成功！";
            }else {
                return Thread.currentThread().getName()+"抢答失败！";
            }
        }
    }
}
