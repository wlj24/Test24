package thread.ali.ThreadLocal;

/**
 * Created by wlj on 2018/12/31.
 */

public class ThreadLocalTest {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                Mes mes=new Mes();
                mes.setInfo("第一线程消息");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Channel.setMes(mes);
                Channel.sendMessage();
            }
        },"第一线程").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                Mes mes=new Mes();
                mes.setInfo("第二线程消息");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Channel.setMes(mes);
                Channel.sendMessage();
            }
        },"第二线程").start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                Mes mes=new Mes();
                mes.setInfo("第三线程消息");
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                Channel.setMes(mes);
                Channel.sendMessage();
            }
        },"第三线程").start();
    }
}

class Mes{
    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}

class Channel{
        private static final  ThreadLocal<Mes> mesThreadLocal=new ThreadLocal<Mes>();
    private Channel(){

    }
    public static void setMes(Mes mes){
       mesThreadLocal.set(mes);
    }
    public  static void sendMessage(){
        System.out.println("消息发送：" + Thread.currentThread().getName() + mesThreadLocal.get().getInfo());
    }
        }
