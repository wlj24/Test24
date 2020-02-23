package designPattern.Adapter;

public class Translator extends Player{
    private ForeignCenter wjzf=new ForeignCenter();

    public Translator(String name) {
        super(name);
        wjzf.setName(name);
    }

    @Override
    public void Attack() {
        wjzf.jc();
    }

    @Override
    public void Defense() {
        wjzf.fs();
    }
}
