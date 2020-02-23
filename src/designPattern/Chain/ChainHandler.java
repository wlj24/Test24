package designPattern.Chain;

public abstract class ChainHandler {
    abstract void handleProcess();
    public void execute(Chain chain){
        handleProcess();
           chain.process();
    }
}
