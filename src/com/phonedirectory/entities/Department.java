package com.phonedirectory.entities;

public class Department {
	
	private String departmentId;
	private String departmentName;
	private String details;
	public Department(){
		
	}
	public String getDepartmentId() {
		return departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public String getDetails() {
		return details;
	}
	public Department(String departmentId, String departmentName, String details) {
		super();
		this.departmentId = departmentId;
		this.departmentName = departmentName;
		this.details = details;
	}
	
	
	@Override
	public String toString() {
		return getDepartmentId();
	}

}
