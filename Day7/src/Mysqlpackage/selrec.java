//package Mysqlpackage;
//
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.ResultSet;
//import java.sql.Statement;
//import java.util.ArrayList;
//
//
//public class selrec {
//public static void main(String[] args) {
//	Statement stmt = null;
//	try {
//		Class.forName("com.mysql.jdbc.Driver");
//		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "root");
//		stmt =con.createStatement();
//		String sql = "Select * from Student";
//		ResultSet rs = stmt.executeQuery(sql);
//		
//		
//		
//		while(rs.next()) {
//			
//			int id = rs.getInt("ID");
//			String name = rs.getString("NAME");
//			int age = rs.getInt("AGE");
//			
//			System.out.println(id+" "+name+" "+age);
//		}
//		
//		
//		ArrayList<Student> ae = new ArrayList<Student>();
//		
//		while(rs.next()) {
//			Student ss= new Student();
//			ss.setId(rs.getInt(ID));
//			
//		}
//		
//	}
//}
//}
