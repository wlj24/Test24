package designPattern.AbstractFactory;

public class Test {
    public static void main(String[] args) {
    //    SqlserverUser sqlserverUser=new SqlserverUser();
        DatabaseFactory databaseFactory=new SqlsevertFacetory();
        DatabaserUser databaserUser=databaseFactory.getDatabaseUser();
        User user=new User();
        databaserUser.addUser(user);
        databaserUser.getUser(1);
        DatabaseDept databaseDept=databaseFactory.getDatabaseDept();
        databaseDept.addDept(new Department());
        databaseDept.getDept(1);
    }
}
