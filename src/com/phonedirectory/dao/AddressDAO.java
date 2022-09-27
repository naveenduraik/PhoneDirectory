package com.phonedirectory.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import com.phonedirectory.dbconnector.DBConnector;
import com.phonedirectory.entities.Address;
import com.phonedirectory.entities.Department;

public class AddressDAO {
	
	Statement statement;
	Connection connection;
	PreparedStatement preparedStatement;
	ResourceBundle resourceBundle;
	public boolean createAddressDAO() 
	{		
		connection= DBConnector.getConnection();		
		resourceBundle = ResourceBundle.getBundle("mysql");		
		String create = resourceBundle.getString("db.createAddress");
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
		System.out.println("Address Object created successfully");			
		return true;
    }
	
	public boolean insertAddressDAO(Address address) {
		connection = DBConnector.getConnection();
		resourceBundle = ResourceBundle.getBundle("mysql");
		String insertAddress = resourceBundle.getString("db.insertAddress");
		PreparedStatement preparedStatement;
		try {
			preparedStatement = connection.prepareStatement(insertAddress);
			preparedStatement.setString(1,address.getT_doorNo());
			preparedStatement.setString(2,address.getT_streetName());
			preparedStatement.setString(3,address.getT_city());
			preparedStatement.setString(4, address.getT_pinCode());
			preparedStatement.setString(5, address.getT_state());
			preparedStatement.setString(6, address.getT_country());
			
			preparedStatement.setString(7,address.getP_doorNo());
			preparedStatement.setString(8,address.getP_streetName());
			preparedStatement.setString(9,address.getP_city());
			preparedStatement.setString(10, address.getP_pinCode());
			preparedStatement.setString(11, address.getP_state());
			preparedStatement.setString(12, address.getP_country());
			preparedStatement.setInt(13,address.get_UserId());			

			preparedStatement.executeUpdate();
			
			System.out.println("Address details updated successfully");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return true;
	}

	
	
}
