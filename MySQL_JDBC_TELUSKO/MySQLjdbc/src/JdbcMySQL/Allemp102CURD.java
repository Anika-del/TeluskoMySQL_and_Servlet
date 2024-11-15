package JdbcMySQL;

import java.sql.*;

public class Allemp102CURD {
	
public static void main(String[] args) throws Exception {
		
		System.out.println("Show data here ...");
		
		Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "mca6");
       
    	 Statement s = con.createStatement();
         
    	// s.executeUpdate("insert into emp102 values('Nonu', 10000)" );
    	   s.executeUpdate("UPDATE emp102 SET salary = 20000 WHERE name = 'Goli'" );
    	// s.executeUpdate("DELETE FROM emp102 WHERE salary = 13000" );
         
         ResultSet result1 = s.executeQuery("select * from emp102");
         while (result1.next()) {
             System.out.println(result1.getString("name") + " = " + result1.getString(2));
         }

         
         s.close();

}
}
