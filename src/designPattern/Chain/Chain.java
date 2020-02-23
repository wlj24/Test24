package designPattern.Chain;

import java.util.List;

public class Chain {
    private List<ChainHandler> handlers;
    private int index=0;
    public Chain(List<ChainHandler> handlers) {
        this.handlers = handlers;
    }

    public void process(){
       if(index>=handlers.size()){
           return;
       }else {
           handlers.get(index++).execute(this);
       }
    }
}
