package com.phonedirectory.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ResourceBundle;

import com.phonedirectory.dbconnector.DBConnector;
import com.phonedirectory.entities.Contact;


public class ContactDAO {
	
	Statement statement;
	ResourceBundle resourceBundle;
	PreparedStatement preparedStatement;
	Connection connection;
	public boolean createContactDAO() {
		
		connection  = DBConnector.getConnection();
		resourceBundle = ResourceBundle.getBundle("mysql");
		String create = resourceBundle.getString("db.createContact");
		try {
			statement = connection.createStatement();
			statement.execute(create);

		} catch (SQLException e) {
			e.printStackTrace();
		}
	return true;
		
	}
	
	public boolean insertContactDAO(Contact contact) {
		
		connection = DBConnector.getConnection();
		resourceBundle = ResourceBundle.getBundle("mysql");
		String insertContact = resourceBundle.getString("db.insertContact");
		try {
			preparedStatement = connection.prepareStatement(insertContact);
			preparedStatement.setInt(1,contact.getContact_id());
			preparedStatement.setString(2,contact.getCountryCode());
			preparedStatement.setString(3,contact.getPrimaryMobileNumber());
			preparedStatement.setString(4, contact.getSecondaryMobileNumber());
			preparedStatement.setInt(5, contact.getUserId());
			preparedStatement.executeUpdate();
			
			System.out.println("Contact details updated successfully");
			
		} catch (SQLException e) {
			e.printStackTrace();
		}				
		
		return true;
	}

}
