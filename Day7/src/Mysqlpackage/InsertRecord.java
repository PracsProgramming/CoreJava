package Mysqlpackage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertRecord {
	public static void main(String[] args) {
		Statement stmt = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1", "root", "root");
			stmt = con.createStatement();
			String sql = "CREATE DATABASE IF NOT EXISTS test1";
			stmt.execute(sql);
			 sql = "CREATE TABLE IF NOT EXISTS person(ID INT UNSIGNED NOT NULL ,NAME CHAR(3) NOT NULL ,ADDRESS VARCHAR(30) NOT NULL,AGE INT UNSIGNED NOT NULL ,PRIMARY KEY (ID))";
			stmt.execute(sql);
			sql = "INSERT INTO Person VALUES (11, 'A', 'B', 18)";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO Person VALUES (22, 'C', 'D', 25)";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO Person VALUES (33, 'E', 'F', 30)";
			stmt.executeUpdate(sql);
			sql = "INSERT INTO Person VALUES(44, 'S', 'M', 28)";
			stmt.executeUpdate(sql);
			System.out.println("All record Inserted...");
			} 
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}

