package JdbcMySQL;

import java.sql.*;

public class DeleteJDBC {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "mca6");
       
    	 Statement s = con.createStatement();
         s.executeUpdate("DELETE FROM emp101 WHERE salary = 13000" );
         s.close();

         System.out.println("Delete data secussefully ...");
	}

}
