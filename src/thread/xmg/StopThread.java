package thread.xmg;

public class StopThread {
    private static Object o=new Object();
    public static void main(String[] args) throws InterruptedException {

        Action a=new Action();
      Thread t=new Thread(a);
      t.start();
      Thread.sleep(1000);
        a.setFlag(false);
//      synchronized (o){
//          o.notify();
//      }

    }
    private static class Action implements Runnable{

        private volatile boolean flag=true;
        @Override
        public void run() {
            synchronized (o) {
                while (flag) {
                    try {
                        o.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            System.out.println("1");
        }

        public void setFlag(boolean flag) {
            this.flag = flag;
        }
    }
}
