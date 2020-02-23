package designPattern.Chain;


import java.util.ArrayList;
import java.util.Arrays;

public class ChainTest {
    static class HandlerA extends Handler{
        @Override
        void handlerProcess() {
            System.out.println("A HANDLER");
        }
    }

    static class HandlerbB extends Handler{
        @Override
        void handlerProcess() {
            System.out.println("B HANDLER");
        }
    }

    static class HandlerbC extends Handler{
        @Override
        void handlerProcess() {
            System.out.println("C HANDLER");
        }
    }

    static class chainA extends ChainHandler{
        @Override
        void handleProcess() {
            System.out.println("C HANDLER");
        }
    }

    static class chainB extends ChainHandler{
        @Override
        void handleProcess() {
            System.out.println("B HANDLER");
        }
    }

    static class chainC extends ChainHandler{
        @Override
        void handleProcess() {
            System.out.println("C HANDLER");
        }
    }

    public static void main(String[] args) {
        Handler handlerA=new HandlerA();
        Handler handlerB=new HandlerbB();
        Handler handlerC=new HandlerbC();
        handlerA.setSuccessor(handlerB);
        handlerB.setSuccessor(handlerC);
        handlerA.execute();

        Chain chain=new Chain(Arrays.asList(new chainA(),new chainB(),new chainC()));
        chain.process();

    }
}
