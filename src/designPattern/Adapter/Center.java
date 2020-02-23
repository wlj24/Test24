package designPattern.Adapter;

public class Center extends Player{

    public Center(String name) {
        super(name);
    }

    @Override
    public void Attack() {
        System.out.println(name+"中锋进攻");
    }

    @Override
    public void Defense() {
        System.out.println(name+"中锋防守");
    }
}
