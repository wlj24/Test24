package designPattern.AbstractFactory;

public class SqlsevertFacetory extends DatabaseFactory{
    @Override
    DatabaserUser getDatabaseUser() {
        return new SqlserverUser();
    }


    @Override
    DatabaseDept getDatabaseDept() {
        return new SqlServerDept();
    }
}
