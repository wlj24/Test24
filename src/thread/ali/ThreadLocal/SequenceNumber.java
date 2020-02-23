package thread.ali.ThreadLocal;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * Created by wlj on 2019/1/12.
 */
public class SequenceNumber {

    public static ThreadLocal<Integer> seqNum=new ThreadLocal<Integer>(){
        public Integer initialValue(){
            return 0;
        }
    };
      AtomicInteger  num=new AtomicInteger(1);
      int num1=0;

    private int getNextNum(){
      //  seqNum.set(seqNum.get()+1);
      //  return seqNum.get();
        return num1++;
    }

    public static void main(String[] args) {
        SequenceNumber sequenceNumber=new SequenceNumber();
        new TestClient(sequenceNumber).start();
        new TestClient(sequenceNumber).start();
        new TestClient(sequenceNumber).start();
    }

    private static class TestClient extends Thread{
        private SequenceNumber sn;
        public TestClient(SequenceNumber sn){
            this.sn=sn;
        }
        public void run(){
            for(int i=0;i<1000;i++){
                try {
                    Thread.sleep(10);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
          //    System.out.println("thread:"+Thread.currentThread().getName()+" sn:"+sn.num.incrementAndGet());
         //       synchronized (SequenceNumber.class) {
                    System.out.println("thread:" + Thread.currentThread().getName() + " sn1111:" +sn.getNextNum() );
          //      }
            }
        }
    }
}

