package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.DepartmentDAO;
import com.model.Department;
@Service("departmentService")
public class DepartmentServiceImpl 
{
	@Autowired
	private DepartmentDAO departmentDAO;

	@Transactional
	public void addDepartment(Department department) {
		departmentDAO.addDepartment(department);
	}
	public void setDepartmentDAO(DepartmentDAO departmentDAO) {
		this.departmentDAO = departmentDAO;
	}

}
