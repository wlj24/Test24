package designPattern.Adapter;

public class Guard extends Player{
    public Guard(String name) {
        super(name);
    }

    @Override
    public void Attack() {
        System.out.println(name+"后卫进攻");
    }

    @Override
    public void Defense() {
        System.out.println(name+"后卫防守");
    }
}
