package thread.xmg;

import java.util.ArrayList;
import java.util.List;

public class ErrorThreadTest {

    public static void main(String[] args) {

        Thread thread=new Thread(new Task());
        Thread thread1=new Thread(new Task1());
        thread.start();
        thread1.start();
    }

    private static class Task implements Runnable{
        List<Object> objects=new ArrayList<>();
        @Override
        public void run() {
            try {
                while (true) {
                    objects.add(new Object());
                    System.out.println(1);
                }
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }

    private static class Task1 implements Runnable{

        @Override
        public void run() {
            while (true){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("111");
            }
        }
    }
}
