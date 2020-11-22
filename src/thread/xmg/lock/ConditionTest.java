package thread.xmg.lock;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ConditionTest {
    private static ReentrantLock lock=new ReentrantLock();
    private static Condition addConditon=lock.newCondition();
    private static Condition removeConditon=lock.newCondition();
    public static void main(String[] args) {
        Factory factory=new Factory();
       new Thread(()->{
           while (true) {
               factory.add();
           }
       }).start();

        new Thread(()->{
            while (true) {
                factory.remove();
            }
        }).start();
    }


    private static class Factory{
        List<String> list=new ArrayList<>();
        int total=100;

        public void  add(){
           lock.lock();
           try {
               while (list.size() == total) {
                 addConditon.await();
               }
               list.add("1");
               System.out.println("添加1个,还有" + list.size() + "个");
               removeConditon.signal();
           } catch (InterruptedException e) {
               e.printStackTrace();
           } finally {
               lock.unlock();
           }
        }

        public void  remove(){
            lock.lock();
            try {
                while (list.size() == 0) {
                    removeConditon.await();
                }
                list.remove(0);
                System.out.println("消费1个,还有" + list.size() + "个");
                addConditon.signal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        }

    }
}
