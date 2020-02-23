package thread.ReentrantLock;

public class MyBlockQueueTest {
    public static void main(String[] args) {
        MyBlockQueue myBlockQueue=new MyBlockQueue(10);
        for(int i=0;i<10;i++){
            int data=i;
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {
                        Thread.sleep(100);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    myBlockQueue.add(data);
                }
            }).start();

        }

        for(int i=0;i<10;i++){
            new Thread(new Runnable() {
                @Override
                public void run() {
//                    try {
//                        Thread.sleep(100);
//                    } catch (InterruptedException e) {
//                        e.printStackTrace();
//                    }
                    myBlockQueue.remove();
                }
            }).start();

        }
    }
}
