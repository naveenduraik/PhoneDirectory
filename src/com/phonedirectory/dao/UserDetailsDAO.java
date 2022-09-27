package com.phonedirectory.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ResourceBundle;
import java.sql.ResultSet;
import com.phonedirectory.dbconnector.DBConnector;
import com.phonedirectory.entities.Department;
import com.phonedirectory.entities.UserDetails;


public class UserDetailsDAO {

	ResourceBundle resourceBundle;
	Statement statement;
	Connection connection;
	UserDetails userDetails;
	PreparedStatement preparedStatement;
	int userId ;
	String firstName,lastName,primaryEmailId,secondaryEmailId,passKey,confirmPassKey,departmentId,designation;
	public boolean createUserDAO() 
	{		
		connection= DBConnector.getConnection();		
		resourceBundle = ResourceBundle.getBundle("mysql");		
		String create = resourceBundle.getString("db.createUser");
		try {
			statement = connection.createStatement();
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			statement.executeUpdate(create);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("UserDetails Object created successfully");			
		return true;
    }
	
	public boolean insertUserDAO(UserDetails userDetails) {
		Department department = new Department();
		connection = DBConnector.getConnection();
		resourceBundle = ResourceBundle.getBundle("mysql");
		String insertContact = resourceBundle.getString("db.insertUser");
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(insertContact);
			//preparedStatement.setInt(1,userDetails.getUserId());
			preparedStatement.setString(1,userDetails.getFirstName());
			preparedStatement.setString(2,userDetails.getLastName());
			preparedStatement.setString(3, userDetails.getPrimaryEmailId());
			preparedStatement.setString(4, userDetails.getSecondaryEmailId());
			preparedStatement.setString(5, userDetails.getPassKey());
			preparedStatement.setString(6, userDetails.getConfirmPasskey());
			preparedStatement.setString(7, userDetails.getDepartmentId());
			preparedStatement.setString(8,userDetails.getDesignation());

			preparedStatement.executeUpdate();
			
			System.out.println("User details updated successfully");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return true;
		
		
	}
	
	
	public List<UserDetails> displayUserDetails(){		
		Connection con ; 
		con = DBConnector.getConnection();		
		PreparedStatement ps;
		ResultSet resultSet;
		List<UserDetails> userList =null;
		
		try {
			ps = con.prepareStatement("select * from userdetails");
			resultSet = ps.executeQuery();
			userList = new ArrayList<UserDetails>();		
			while(resultSet.next()){
				userId = resultSet.getInt(1);
				firstName = resultSet.getString(2);
				lastName = resultSet.getString(3);
				primaryEmailId= resultSet.getString(4);
				secondaryEmailId = resultSet.getString(5);
				passKey = resultSet.getString(6);
				confirmPassKey = resultSet.getString(7);
				departmentId = resultSet.getString(8);
				designation = resultSet.getString(9);
				
				userDetails  = new UserDetails(userId, firstName, lastName, primaryEmailId, secondaryEmailId, passKey, confirmPassKey, departmentId, designation);
				userList.add(userDetails);	
				System.out.println(userId + "-- "+ firstName+" -- "+lastName+"-- "+designation);
			}
			System.out.println("-----"+userList.size());
			
		}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	
		return userList;
	}
}
