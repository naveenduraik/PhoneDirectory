package com.phonedirectory.BO;

import com.phonedirectory.dao.ContactDAO;
import com.phonedirectory.entities.Contact;

public class ContactBO {
	ContactDAO contactDAO;
	public boolean createContactBO() {
		  contactDAO = new ContactDAO();
		contactDAO.createContactDAO();
		return true;
		
	}
	
	public boolean insertContactBO(Contact contact) {
		 contactDAO = new ContactDAO();
		 contactDAO.insertContactDAO(contact);
		return true;
	}
}
