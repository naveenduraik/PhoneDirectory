package com.phonedirectory.BO;

import java.util.List;

import com.phonedirectory.dao.UserDetailsDAO;
import com.phonedirectory.entities.UserDetails;

public class UserDetailsBO {
	UserDetailsDAO userDetailsDAO ;
	public boolean createUserBO() {
		userDetailsDAO = new UserDetailsDAO();
		userDetailsDAO.createUserDAO();
		return true;
	}
	public boolean insertUserBO(UserDetails userDetails) {
		userDetailsDAO = new UserDetailsDAO();
		userDetailsDAO.insertUserDAO(userDetails);
		return true;
	}
	
	public List<UserDetails> displayUserList(){
		userDetailsDAO = new UserDetailsDAO();
		return userDetailsDAO.displayUserDetails();
		
	}
	public void displayContactBO(){
		userDetailsDAO = new UserDetailsDAO();
		userDetailsDAO.displayContact();
	}
}
