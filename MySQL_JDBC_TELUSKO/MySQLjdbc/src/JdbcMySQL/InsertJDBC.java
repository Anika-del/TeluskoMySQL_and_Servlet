package JdbcMySQL;

import java.sql.*;

public class InsertJDBC {

	public static void main(String[] args) throws Exception {

		Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/testdb", "root", "mca6");
       
    	 Statement s = con.createStatement();
         s.executeUpdate("insert into emp101 values('Roli', 14000)" );
         s.close();

         System.out.println("Insert data secussefully ...");


	}

}
