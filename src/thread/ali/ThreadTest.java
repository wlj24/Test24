package thread.ali;

public class ThreadTest {
    private static Object sync=new Object();

    public static void main(String[] args) {
       Thread1 thread1=new Thread1(1,"奇线程");
       Thread1 thread2=new Thread1(0,"偶线程");
       thread1.start();
       thread2.start();

    }
    static  class Thread1 extends Thread{
        private  int flag;
        private int i=0;
        public Thread1(int flag,String name){
            super(name);
            this.flag=flag;
        }

        @Override
        public void run() {
            while (true) {
          synchronized (sync){

              if (i%2==flag) {
                  System.out.println(Thread.currentThread().getName() + (i++));
              }else {
                  System.out.println(Thread.currentThread().getName() + (i++));
              }

              }
          }
        }
    }
}
