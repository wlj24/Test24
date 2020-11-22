package thread.ReentrantLock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class ABCThread {
    public static void main(String[] args) {
        ReentrantLock lock=new ReentrantLock();
        Prinnt prinnt=new Prinnt(0,lock);
        Prinnt prinnt1=new Prinnt(1,lock);
        Prinnt prinnt2=new Prinnt(2,lock);
        new Thread(prinnt).start();
        new Thread(prinnt1).start();
        new Thread(prinnt2).start();
    }

    static class Prinnt implements Runnable{
       private int i;
       static int a=0;
       static boolean flag=false;
        ReentrantLock lock;
        public Prinnt(int a,ReentrantLock lock){
            this.i=a;
            this.lock=lock;
        }
        @Override
        public void run() {
            while (true) {

                lock.lock();
                try {
                    if(a>=30){
                        break;
                    }
               //     System.out.println(i);
                   if(a%3==i&&i==0){
                       System.out.println(Thread.currentThread().getName()+"A");
                       flag=true;
                   }else if(a%3==i&&i==1){
                       System.out.println(Thread.currentThread().getName()+"B");
                       flag=true;
                   }else if(a%3==i&&i==2){
                       System.out.println(Thread.currentThread().getName()+"C");
                       flag=true;
                   }
                   if(flag==true){
                       a++;
                       flag=false;
                   }


                }finally {
                   lock.unlock();
                }
            }
        }
    }
}
