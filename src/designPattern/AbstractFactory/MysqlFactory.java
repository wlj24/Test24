package designPattern.AbstractFactory;

public class MysqlFactory extends DatabaseFactory{
    @Override
    DatabaserUser getDatabaseUser() {
        return new MysqlUser();
    }

    @Override
    DatabaseDept getDatabaseDept() {
        return new MysqlDept();
    }
}
