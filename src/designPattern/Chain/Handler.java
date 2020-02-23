package designPattern.Chain;

public abstract class Handler {
    private Handler successor;

    public Handler getSuccessor() {
        return successor;
    }

    public void setSuccessor(Handler successor) {
        this.successor = successor;
    }

    public void execute(){
        handlerProcess();
        if(successor!=null){
            successor.execute();
        }
    }

    abstract void handlerProcess();
}
