package designPattern.AbstractFactory;

public class SqlserverUser extends DatabaserUser{
    public void addUser(User user){
        System.out.println("sqlserver 插入数据");
    }

    public void getUser(int id){
        System.out.println("sqlserver 获取数据");
    }
}
