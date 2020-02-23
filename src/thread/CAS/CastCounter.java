package thread.CAS;

public class CastCounter {
    private SimulatedCAS simulatedCAS=new SimulatedCAS();

    public int getValue(){
        return simulatedCAS.get();
    }

    public int increment(){
        int v;
        do{
            v=simulatedCAS.get();
            System.out.println(Thread.currentThread().getName()+": "+v);
        }while (v!=simulatedCAS.compareAndSwap(v,v+1));
        return v+1;

    }

    public static void main(String[] args) {
        CastCounter castCounter=new CastCounter();
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    castCounter.increment();
                }
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    castCounter.increment();
                }
            }
        }).start();
    }

}
