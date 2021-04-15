package thread.ReentrantLock;

import a.E;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ReentranLockTest {
    public static void main(String[] args) {
//        PrintDemo PD = new PrintDemo();
//        ThreadDemo t1 = new ThreadDemo( "Thread - 1 ", PD );
//        ThreadDemo t2 = new ThreadDemo( "Thread - 2 ", PD );
//        ThreadDemo t3 = new ThreadDemo( "Thread - 3 ", PD );
//        ThreadDemo t4 = new ThreadDemo( "Thread - 4 ", PD );
//        t1.start();
//        t2.start();
//        t3.start();
//        t4.start();
        if (test2()&&test2()){
            System.out.println(1);
        }
    }
    public static boolean test1(){
        System.out.println("2");
        return true;
    }
    public static boolean test2(){
        System.out.println("1");
        return false;
    }
}



class PrintDemo{
    private final Lock queueLock=new ReentrantLock();
    public void  print(){
       while (!queueLock.tryLock()){
           try {
               TimeUnit.MILLISECONDS.sleep(10);
           } catch (InterruptedException e) {
               e.printStackTrace();
           }
       }
        try {
            Long duration=(long)(Math.random()*10000);
            System.out.println(Thread.currentThread().getName()
            +" time take "+(duration/1000)+"seconds");
            test();
            Thread.sleep(duration);
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            System.out.printf("%s printed the document successfully.\n", Thread.currentThread().getName());


            queueLock.unlock();
        }
    }


    public void  test(){
        queueLock.lock();
        try {
            System.out.println(Thread.currentThread().getName());
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            queueLock.unlock();
        }


    }
}


class ThreadDemo extends Thread {
    PrintDemo  printDemo;

    ThreadDemo( String name,  PrintDemo printDemo) {
        super(name);
        this.printDemo = printDemo;
    }

    @Override
    public void run() {
        System.out.printf("%s starts printing a document\n", Thread.currentThread().getName());
        printDemo.print();
    }
}



