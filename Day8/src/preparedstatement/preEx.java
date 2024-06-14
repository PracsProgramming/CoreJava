package preparedstatement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.mysql.jdbc.ResultSet;

public class preEx {
public static void main(String[] args) throws Exception{
	Class.forName("com.mysql.jdbc.Driver");
	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/test","root","root");
	System.out.println("Connected");
	
	PreparedStatement pstmt = con.prepareStatement("insert into student values(?,?,?)");
	ResultSet rs = (ResultSet) pstmt.executeQuery();
	
	while(rs.next()) {
		int id = rs.getInt(1);
		String name = rs.getString(2);
		int age = rs.getInt(3);
		
		System.out.println("Id="+id+"name ="+name+"age = "+age);
	}


	
}
}
