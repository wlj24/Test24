package thread.ReentrantLock;



import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class MyBlockQueue<E> {
    int size;
    ReentrantLock lock=new ReentrantLock();
    Condition notFull=lock.newCondition();
    Condition notEmpty=lock.newCondition();
    LinkedList<E> linkedList=new LinkedList<>();

    public MyBlockQueue(int size){
        this.size=size;
    }

    public void add(E e){
        lock.lock();
        try {

            while (linkedList.size() == size) {
                try {
                    notFull.await();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
            linkedList.add(e);
            System.out.println("添加元素" + e);
            notEmpty.signal();
        }finally {
            lock.unlock();
        }

    }

    public void remove(){
        lock.lock();
        try {
            while (linkedList.size() == 0) {
                try {
                    notEmpty.await();
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
            E a = linkedList.remove();
            System.out.println("移除元素" + a);
            notFull.signal();
        }finally {
            lock.unlock();
        }

    }


}
