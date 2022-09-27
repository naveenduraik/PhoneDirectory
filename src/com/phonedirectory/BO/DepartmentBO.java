package com.phonedirectory.BO;

import com.phonedirectory.dao.DepartmentDAO;
import com.phonedirectory.entities.Department;

public class DepartmentBO {
DepartmentDAO departmentDAO;

		public boolean createDepartmentBO() {
			departmentDAO = new DepartmentDAO();
			return departmentDAO.createDepartmentDAO();
		}
		
		public boolean insertDepartmentBO(Department department) {
			 departmentDAO = new DepartmentDAO();
			 return departmentDAO.insertDepartmentDAO(department);
			 
		}
}
