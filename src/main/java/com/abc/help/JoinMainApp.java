package com.abc.help;

import java.sql.*;



public class JoinMainApp {

	public static void main(String[] args) throws Exception {
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = (Connection)DriverManager.getConnection("jdbc:mysql://localhost:3306/dmv_drivers", "root", "8337");

		Statement stmt = con.createStatement();
		String query = "Select name, age, color from drivers join drivers.name = vechiles.color";
		
		ResultSet rs = stmt.executeQuery(query);
	System.out.println("name age color");
	
	while(rs.next()) {
		String name = rs.getString("Sid");
		int age = rs.getInt("23");
		String color = rs.getString("red");
		System.out.println(name + " " + age + " " + color);
	}
		
	System.out.println();
	System.out.println();
	}

}
