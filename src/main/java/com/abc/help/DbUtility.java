package com.abc.help;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbUtility {

	public static Connection getConnection()  {
		try {
			Class.forName("com.mysql.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		Connection con = null;
		try {
			 con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/dmv_drivers", "root", "8337");
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		
		return con;
	}

}
