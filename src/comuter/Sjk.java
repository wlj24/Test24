package comuter;

import java.sql.*;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Sjk {
	public static void main(String args[]) throws ParseException{
		Connection conn;
	
			ResultSet rs;
			try{Class.forName("com.mysql.jdbc.Driver");
			
			}
			catch(ClassNotFoundException e){
				System.out.println(e);
			}
			try{
conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","123");

/*rs=sql.executeQuery("select * from users");
while(rs.next()){
	String id=rs.getString("username");
	String name=rs.getString("password");
	Date date=rs.getDate("time");
	System.out.println(date);
	System.out.println(id);
	System.out.println(name);
}*/

Scanner s=new Scanner(System.in);
System.out.println("«Î ‰»Î»’∆⁄£∫");
String date=s.nextLine();
SimpleDateFormat df = new SimpleDateFormat("yyyy/MM/dd");
java.util.Date d= df.parse(date);
String sql="insert into shijian(time)"+ " values(?)";
PreparedStatement ptmt=conn.prepareStatement(sql);
ptmt.setDate(1,new java.sql.Date(d.getTime()));
ptmt.execute();
String sql1="select * from shijian";
Statement ss=conn.createStatement();
rs=ss.executeQuery(sql1);
while(rs.next()){
	int id=rs.getInt("id");
	Date date1=rs.getDate("time");
	System.out.println(id);
	System.out.println(date1);
	
}
conn.close();
			}
			catch(SQLException e){
				System.out.println(e);
			}
			
						
			
					
	}

}
