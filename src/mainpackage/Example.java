package mainpackage;

import java.sql.*;

public class Example {

	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		
		// connecting jdbc with database
		
		// loading driver
		Class.forName("oracle.jdbc.OracleDriver");
		
		//establishing connection
		Connection con = null;
		
		con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/xe","system","sai");
		
		if(con!=null) {
			System.out.println("Established");
		}
		else 
			System.out.println("Not Established");
		
	}

}

