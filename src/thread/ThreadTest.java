package thread;

public class ThreadTest {
    private static   Object o=new Object();
    static int a=0;
    public static void main(String[] args) {
        Thread thread =new Thread(new A());
        Thread thread1=new Thread(new B());
        Thread thread2=new Thread(new C());
        thread.start();
        thread1.start();
        thread2.start();
    }

    static class  A implements Runnable{
          public void run(){
              synchronized (o) {
                  for (int i = 0; i < 10; i++) {
                      while (a != 0) {
                          try {
                              o.wait();
                          } catch (InterruptedException e) {
                              e.printStackTrace();
                          }
                      }
                      System.out.print("A");
                      a=1;
                      o.notifyAll();

                  }
              }
          }
    }

    static class  B implements Runnable{
        public void run(){
            synchronized (o) {
                for (int i = 0; i < 10; i++) {
                    while (a!=1) {
                        try {
                            o.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.print("B");
                    a=2;
                    o.notifyAll();

                    }
                }
            }
        }
    static class  C implements Runnable{
        public void run(){
            synchronized (o) {
                for (int i = 0; i < 10; i++) {
                    while (a!=2){
                        try {
                            o.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                    System.out.println("C");
                    a=0;
                    o.notifyAll();

                }
            }
        }
    }
}


