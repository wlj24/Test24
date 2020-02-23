package thread;

class Producer implements Runnable
{
    Q q;
    Producer(Q q)
    {
        this.q = q;
        this.q.name="producer";
    }
    public void run()
    {
        while(true)
        {
            synchronized(q)
            {
                if(q.num<q.size)
                {
                    q.num++;
                    System.out.println("producer�������ڣ�"+q.num+"����Ʒ!");
                    try {
                        Thread.currentThread().sleep(100);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                    q.notify();
                }
                else
                {
                    try {
                        System.out.println("producer stop!");
                        q.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
