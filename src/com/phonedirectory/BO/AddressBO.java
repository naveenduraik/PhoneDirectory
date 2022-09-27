package com.phonedirectory.BO;

import com.phonedirectory.dao.AddressDAO;
import com.phonedirectory.entities.Address;

public class AddressBO {
	AddressDAO addressDAO;
	public boolean createAddressBO() {
		
		addressDAO = new AddressDAO();
		addressDAO.createAddressDAO();
		
		return true;
		
	}
	
	public boolean insertAddressBO(Address address) {
		addressDAO = new AddressDAO();
		addressDAO.insertAddressDAO(address);
		return true;
	}

}
