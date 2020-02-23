package designPattern.Adapter;

public class ForeignCenter {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public void  jc(){
        System.out.println("外籍中锋进攻"+name);
    }

    public void fs(){
        System.out.println("外籍中锋防守"+name);
    }
}
