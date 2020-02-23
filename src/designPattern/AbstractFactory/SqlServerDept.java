package designPattern.AbstractFactory;

public class SqlServerDept extends DatabaseDept{
    @Override
    void addDept(Department department) {
        System.out.println("sqlserver 添加部门");
    }

    @Override
    void getDept(int id) {
        System.out.println("sqlserver 获取人员");
    }
}
