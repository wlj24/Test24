package thread;

public class JoinDemo extends Thread {
    int i;
    Thread preiousThread;
    public JoinDemo(Thread preiousThread,int i){
        this.preiousThread=preiousThread;
        this.i=i;
    }

    public void run(){
        try {
            preiousThread.join();
        }catch (Exception e){
            e.printStackTrace();
        }
        System.out.println("num:"+i);
    }

    public static void main(String[] args) {
        Thread previous=Thread.currentThread();
        for(int i=0;i<10;i++){
            JoinDemo joinDemo=new JoinDemo(previous,i);
            joinDemo.start();
            previous=joinDemo;
        }

    }
}
