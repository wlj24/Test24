package thread.ali;

/**
 * Created by wlj on 2018/12/16.
 */
public class NumThreadDemo {
    public static void main(String[] args) {
        Resource resource=new Resource();
        Thread addthread=new Thread(new addThread(resource),"+");
        Thread addthread1=new Thread(new addThread(resource),"+!");
        Thread deletethread1=new Thread(new deleteThread(resource),"-");
        Thread deletethread2=new Thread(new deleteThread(resource),"-1");
        addthread.start();
        addthread1.start();
        deletethread1.start();
        deletethread2.start();
    }
}

class Resource{
    private int num=0;
    private boolean flag=true;
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public boolean isFlag() {
        return flag;
    }

    public void setFlag(boolean flag) {
        this.flag = flag;
    }

    public synchronized  void add(){
        if(flag==false){
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }else {
            num++;
            System.out.println(Thread.currentThread()+"" + num);
            flag=false;
            super.notifyAll();
        }
    }

    public synchronized void delete(){
        if(flag==false) {
            num--;
            System.out.println(Thread.currentThread()+"" + num);
            flag=true;
            super.notifyAll();
        }else {
            try {
                super.wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }



}


class addThread implements Runnable{

    private Resource resource;
    public addThread(Resource resource){
        this.resource=resource;
    }
    @Override
    public void run() {
        for(int i=0;i<500;i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            resource.add();
        }
    }
}

class deleteThread implements Runnable{

    private Resource resource;
    public deleteThread(Resource resource){
        this.resource=resource;
    }
    @Override
    public void run() {
        for(int i=0;i<500;i++){
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            resource.delete();
        }
    }
}
