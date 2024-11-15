package JdbcMySQL;

import java.sql.*;

public class UpdatJDBC {

	public static void main(String[] args) throws Exception {
		
		Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "mca6");
       
    	 Statement s = con.createStatement();
         s.executeUpdate("UPDATE emp101 SET name = 'AAdi', salary = '15000' WHERE salary = 11000" );
         s.close();

         System.out.println("Update data secussefully ...");

	}

}
