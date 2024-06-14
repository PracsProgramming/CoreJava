package Mysqlpackage;

import java.sql.Connection;
import java.sql.DriverManager;

public class mysqlconn {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		try {
			//Class.forName(com.mysql.jdbc.Driver)
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
			System.out.println("Connected");
		}catch(Exception e) {
			System.out.println("Error");
		}
	}
}
