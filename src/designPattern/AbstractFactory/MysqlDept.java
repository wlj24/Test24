package designPattern.AbstractFactory;

public class MysqlDept extends DatabaseDept{
    @Override
    void addDept(Department department) {
        System.out.println("mysql添加部门");
    }

    @Override
    void getDept(int id) {
        System.out.println("mysql获取部门");
    }
}
