package Mysqlpackage;

import java.sql.DriverManager;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.ResultSet;
import com.mysql.jdbc.Statement;

public class SelectedRecord {
@SuppressWarnings("unused")
public static void main(String[] args) {
	Statement stmt = null;
	try {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
		stmt = (Statement) con.createStatement();
		String sql = "SELECT * FROM student";
		ResultSet rs = (ResultSet) stmt.executeQuery(sql);
		while(rs.next()) {
			int id = rs.getInt("ID");
			String name = rs.getString("NAME");
			int age = rs.getInt("AGE");
			
			System.out.println(id+" "+name+" "+age);
	
		}
	}catch(Exception e) {
		e.printStackTrace();
	}
}
}
