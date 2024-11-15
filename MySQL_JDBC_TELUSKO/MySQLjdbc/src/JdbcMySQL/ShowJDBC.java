package JdbcMySQL;

import java.sql.*;

public class ShowJDBC {

	public static void main(String[] args) throws Exception {
		
		System.out.println("Show data here ...");
		
		Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "mca6");
       
    	 Statement s = con.createStatement();
         
         ResultSet result1 = s.executeQuery("select * from emp101");
         
         while (result1.next()) {
             System.out.println(result1.getString("name") + " = " + result1.getString(2));
         }

         
         s.close();
	}

}
