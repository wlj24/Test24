package thread;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class Priority {
    private static volatile boolean noStart=true;
    private static volatile  boolean notEnd=true;

    public static void main(String[] args) throws Exception{
        List<Job> jobs=new ArrayList<Job>();
        for(int i=0;i<10;i++){
            int priority=Thread.MAX_PRIORITY;
            Job job=new Job(priority);
            jobs.add(job);
            Thread thread=new Thread(job,"Thread:"+i);
            thread.setPriority(priority);
            thread.start();
        }

        noStart=false;
        TimeUnit.SECONDS.sleep(10);
        notEnd=false;
        for(Job job:jobs){
            System.out.println("job pri"+job.priority+"jobcount"+job.jobCount);
        }
    }
    static class Job implements Runnable{
        private int priority;
        private long jobCount;

        public Job(int priority){
            this.priority=priority;
        }

        @Override
        public void run() {
           while (noStart){
               Thread.yield();
               System.out.println(Thread.currentThread().getName());
           }
           while (notEnd){
             //  System.out.println(Thread.currentThread().getName());
               Thread.yield();
               jobCount++;
           }
        }
    }
}
