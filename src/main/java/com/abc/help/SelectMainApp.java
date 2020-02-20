package com.abc.help;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class SelectMainApp {

	public static void main(String[] args) throws Exception {

		Connection con = DbUtility.getConnection();
		
		Statement stmt = con.createStatement();
		
		String sql = "select * from drivers";
	
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			int id = rs.getInt("id");
			String name = rs.getString("name");
			int age = rs.getInt("age");
			String state = rs.getString("state");
			String address = rs.getString("address");
			System.out.printf("\nid >>> " + id + " -> name -> " + name + "-> age -> " + age + " -> state : " + state + "-> address ->> " + address);
		}
	}

}
