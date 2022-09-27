package com.phonedirectory.entities;

public class Contact {
	private int contact_id;
	private String countryCode;
	private String primaryMobileNumber;
	private String secondaryMobileNumber;
	private int userId;
	
	
	public Contact(int contact_id, String countryCode, String primaryMobileNumber, String secondaryMobileNumber,
			int userId) {
		super();
		this.contact_id = contact_id;
		this.countryCode = countryCode;
		this.primaryMobileNumber = primaryMobileNumber;
		this.secondaryMobileNumber = secondaryMobileNumber;
		this.userId = userId;
	}
	public int getContact_id() {
		return contact_id;
	}
	public String getCountryCode() {
		return countryCode;
	}
	public String getPrimaryMobileNumber() {
		return primaryMobileNumber;
	}
	public String getSecondaryMobileNumber() {
		return secondaryMobileNumber;
	}
	public int getUserId() {
		return userId;
	}
	
	

}
