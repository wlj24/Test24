package thread;

import JWM.GcTest;

public class TicketTest {
    public static  int[] arr = new int[100];


    static volatile int  num=arr.length;
    static  int count=0;
    public static  boolean[]  b=null;
    public static void main(String[] args) {
        for(int i=0;i<100;i++){
            arr[i]=i+1;
        }
        b=new boolean[arr.length];
        GetTicket getTicket=new GetTicket();
     new Thread(getTicket,"前门").start();
     new Thread(getTicket,"后门").start();
    }


    static class GetTicket implements Runnable{
        @Override
        public void run() {
            while (true) {
                synchronized (this) {


            //        System.out.println(Thread.currentThread().getName()+arr);
                   if(num<0){
                       return;
                   }
                    if (num > 0) {
                        int n = (int) (1 + Math.random() * arr.length) - 1;
                        if (b[n] != true) {
                            b[n] = true;
                            System.out.println(Thread.currentThread().getName() + "抽中" + arr[n]);
                            if("前门".equals(Thread.currentThread().getName())){
                                count++;
                            }
                            num--;
                        }
                    }else if(num==0){
                        System.out.println("前门"+count);
                        System.out.println("后门"+(100-count));
                        num--;
                    }
                }
            }
        }
    }
}


