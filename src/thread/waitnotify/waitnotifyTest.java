package thread.waitnotify;

public class waitnotifyTest {
    public static void main(String[] args) {
        Chat chat=new Chat();
     Thread thread=new Thread(new T1(chat),"ques");
     Thread thread1=new Thread(new T2(chat),"answ");
     thread.start();
     thread1.start();
    }



}

class Chat{
    boolean flag=false;
    public synchronized void question(String msg){
        if(flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(msg);
        flag=true;
        notify();
    }

    public synchronized void  answer(String msg){
        if(!flag){
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println(msg);
        flag=false;
        notify();
    }
}

class T1 implements Runnable{
    Chat chat;
    int[] a={1,3,5};
    public T1(Chat chat){
        this.chat=chat;
    }

    @Override
    public void run() {
        for (int i=0;i<a.length;i++){
            chat.question(a[i]+"");
        }

    }
}

class T2 implements Runnable{
    Chat chat;
    int[] a={2,4,6};
    public T2(Chat chat){
        this.chat=chat;
    }

    @Override
    public void run() {
        for (int i=0;i<a.length;i++){
            chat.answer(a[i]+"");
        }

    }
}
