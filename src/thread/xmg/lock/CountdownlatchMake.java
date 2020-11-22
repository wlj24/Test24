package thread.xmg.lock;

public class CountdownlatchMake {
    private int count;

    public CountdownlatchMake(int count){
        this.count=count;
    }

    public void countDown(){
          synchronized (this){
              count--;
              if(count==0){
                  this.notify();
              }
          }
    }

    public void await() throws InterruptedException {
        synchronized (this){
            while (count>0) {
                this.wait();
            }

        }
    }
}
