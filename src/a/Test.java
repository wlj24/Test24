package a;

import java.io.IOException;

public class Test {
    
    private int i = 10;
    private Object object = new Object();
     
    public static void main(String[] args) throws IOException  {
        Test test = new Test();
        MyThread thread1 = test.new MyThread();
        MyThread thread2 = test.new MyThread();
        thread1.start();
        thread2.start();
    } 
     
     
    class MyThread extends Thread{
        @Override
        public void run() {
            
                i++;
                System.out.println("i:"+i);
                try {
                    System.out.println("�߳�"+Thread.currentThread().getName()+"����˯��״̬");
                    Thread.currentThread().sleep(10000);
                } catch (InterruptedException e) {
                    // TODO: handle exception
                }
                System.out.println("�߳�"+Thread.currentThread().getName()+"˯�߽���");
                i++;
                System.out.println("i:"+i);
            
        }
    }
}
