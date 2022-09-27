package com.phonedirectory.entities;
public class UserDetails {
	/* Bean class /pojo class */
	private int userId;
	private String firstName;
	private String lastName;
	private String primaryEmailId;
	private String secondaryEmailId;
	private String passKey;
	private String confirmPasskey;
	private String departmentId;
	private String designation;

	
	 public UserDetails(int userId, String firstName, String lastName, String
	  primaryEmailId, String secondaryEmailId, String passKey, String
	 confirmPasskey, String departmentId, String designation) {
		 	 super();
			 this.userId = userId; this.firstName = firstName; this.lastName = lastName;
			 this.primaryEmailId = primaryEmailId; this.secondaryEmailId =
			 secondaryEmailId; this.passKey = passKey; this.confirmPasskey =
			 confirmPasskey; this.departmentId = departmentId; this.designation =
			 designation; 
	 }
	 

	public UserDetails(String firstName, String lastName, String primaryEmailId, String secondaryEmailId,
			String passKey, String confirmPasskey, String departmentId, String designation) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.primaryEmailId = primaryEmailId;
		this.secondaryEmailId = secondaryEmailId;
		this.passKey = passKey;
		this.confirmPasskey = confirmPasskey;
		this.departmentId = departmentId;
		this.designation = designation;
	}

	public int getUserId() {
		return userId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getPrimaryEmailId() {
		return primaryEmailId;
	}

	public String getSecondaryEmailId() {
		return secondaryEmailId;
	}

	public String getPassKey() {
		return passKey;
	}

	public String getConfirmPasskey() {
		return confirmPasskey;
	}

	public String getDepartmentId() {
		return departmentId;
	}

	public String getDesignation() {
		return designation;
	}

}