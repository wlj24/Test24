package thread.ali;

/**
 * Created by wlj on 2018/11/11.
 */
public class ThreadDemo {
    public static void main(String[] args) {
        Message message=new Message();
        new Thread(new Producer(message)).start();
        new Thread(new Consumer(message)).start();
    }
}

/**
 * 生产者
 */
class Producer implements Runnable{
    private Message message;
    public Producer(Message message){
        this.message=message;
    }
    @Override
    public void run() {
        for(int i=0;i<100;i++){

            if (i % 2 == 1) {

                message.set("22","33");

            } else {
                message.set("11","44");
            }
        }
    }
}

class Consumer implements Runnable{
    private Message message;
    public Consumer(Message message){
        this.message=message;
    }
    @Override
    public void run() {
        for(int i=0;i<100;i++) {
            message.get();
        }
    }
}
/**
 *
 */
class Message{
    private String titel;
    private String name;
    private boolean flag=false;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public synchronized void get(){
        if(flag==false){
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
                System.out.println(this.getTitel() + this.getName());
                flag=false;
        super.notify();

    }
    public synchronized void set(String name,String tile){
        if(this.flag==true){
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        this.setTitel(name);
        this.setName(tile);
        flag=true;
        notify();
    }
}
