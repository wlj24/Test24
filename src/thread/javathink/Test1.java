package thread.javathink;

public class Test1 {

    public static void main(String[] args) {
        for(int i=0;i<10;i++) {
            Thread t1 = new Thread(new T1());
            t1.start();
        }
    }

    static class T1 implements Runnable{

          public T1(){
              System.out.println(Thread.currentThread()+"线程初始化");
          }
        @Override
        public void run() {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread()+"1");
            Thread.yield();
            System.out.println(Thread.currentThread()+"2");
            Thread.yield();
            System.out.println(Thread.currentThread()+"3");
            Thread.yield();
            System.out.println(Thread.currentThread()+"结束");
        }
    }
}
