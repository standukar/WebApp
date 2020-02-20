package com.abc.help;


import java.sql.Connection;
//import java.sql.DriverManager;
import java.sql.Statement;




public class InsertMainApp {

	public static void main(String[] args) throws Exception {
	//Class.forName("com.mysql.jdbc.Driver");
	//Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/dmv_drivers", "root", "8337");
	
		Connection con = DbUtility.getConnection();
	Statement stmt = con.createStatement();
	String sql = "insert into drivers(name, age, state, address) values ('Sid', '23','VA', '700 lee hwy')";
	stmt.executeUpdate(sql);
	}

}
