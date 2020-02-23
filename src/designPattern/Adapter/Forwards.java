package designPattern.Adapter;

public class Forwards extends Player{

    public Forwards(String name) {
        super(name);
    }

    @Override
    public void Attack() {
        System.out.println(name+"前锋进攻");
    }

    @Override
    public void Defense() {
        System.out.println(name+"前锋防守");
    }
}
