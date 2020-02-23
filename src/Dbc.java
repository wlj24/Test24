import java.sql.*;
public class Dbc {
	private static Connection con;
	private static 	Statement  st;
	private static ResultSet rs;
	public static void  getconn() {
	try{
	Class.forName("com.mysql.jdbc.Driver");
	}catch(ClassNotFoundException e){
		e.printStackTrace();
	}
	
	try{
		con = DriverManager.getConnection(
				"jdbc:mysql://localhost:3306/test?characterEncoding=utf-8",
				"root", "123");
	}
	 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static String SlePwd(String username){
		String result = null;
		try{
			getconn();
			st=con.createStatement();
			String sql="select password from users where username='"+username+"'";
			rs=st.executeQuery(sql);
			while(rs.next()){
				result=rs.getString(1);
			}
		}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		return result;
		
	}

public static void main(String args[]){
	String username="pp";
	System.out.println(Dbc.SlePwd(username));
	
}
}