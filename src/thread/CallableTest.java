package thread;

import java.util.concurrent.*;

public class CallableTest {

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService es = Executors.newFixedThreadPool(3);
        Future<String> futureT=es.submit(new Call());
        System.out.println(futureT.get());
          es.shutdown();
    }

    static class Call implements Callable<String>{

        @Override
        public String call() throws Exception {
            Thread.sleep(10000);
            return "123";
        }
    }
}
