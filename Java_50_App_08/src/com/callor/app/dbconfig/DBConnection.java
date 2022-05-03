package com.callor.app.dbconfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	
	private  static Connection conn;
	static {
		// url = "사용자의 Oracle 주소"
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String username = "user2";
		String password = "12341234";
		
		try {
			conn = DriverManager.getConnection(url,username, password);
			System.out.println("DB Connection OK");
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
	} // end static
	
	public static Connection getDBConnection() {
		return conn;
	}

}
