package designPattern.AbstractFactory;

public class MysqlUser extends DatabaserUser{
    @Override
    void addUser(User user) {
        System.out.println("mysql添加人员");
    }

    @Override
    void getUser(int id) {
        System.out.println("mysql获取人员");
    }
}
