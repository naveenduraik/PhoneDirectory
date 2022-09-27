package com.phonedirectory.dbconnector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class DBConnector {

    public static Connection getConnection(){
		
		ResourceBundle resourceBundle = ResourceBundle.getBundle("mysql");
		String url = resourceBundle.getString("db.url");
		String username = resourceBundle.getString("db.username");
		String password = resourceBundle.getString("db.password");
		Connection connection  = null;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			connection = DriverManager.getConnection(url, username,password);

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			((Throwable) e).printStackTrace();
		}
		return connection;
	}
    
}
