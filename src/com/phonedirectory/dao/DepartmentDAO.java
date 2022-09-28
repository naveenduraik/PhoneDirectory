package com.phonedirectory.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import com.phonedirectory.dbconnector.DBConnector;
import com.phonedirectory.entities.Department;

public class DepartmentDAO {
	Statement statement;
	Connection connection;
	PreparedStatement preparedStatement;
	ResourceBundle resourceBundle;
	public boolean createDepartmentDAO() 
	{		
		connection= DBConnector.getConnection();		
		resourceBundle = ResourceBundle.getBundle("mysql");		
		String create = resourceBundle.getString("db.createDepartment");
		try {
			statement = connection.createStatement();
		} catch (SQLException e1) {
			e1.printStackTrace();
		}
		try {
			statement.executeUpdate(create);
		} catch (SQLException e) {
			e.printStackTrace();
		}
 			return true;
    }
	
	
	public boolean insertDepartmentDAO(Department department) {
		connection = DBConnector.getConnection();
		resourceBundle = ResourceBundle.getBundle("mysql");
		String insertContact = resourceBundle.getString("db.insertDepartment");
		try {
			preparedStatement = connection.prepareStatement(insertContact);
			preparedStatement.setString(1,department.getDepartmentId());
			preparedStatement.setString(2,department.getDepartmentName());
			preparedStatement.setString(3,department.getDetails());		
			preparedStatement.executeUpdate();			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return true;
	}

}
