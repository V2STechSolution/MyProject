package com.dao;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import com.model.Department;

public class DepartmentDAOImpl 
{
	@Autowired
	private SessionFactory sessionFactory;
	
	public void addDepartment(Department department) {
		sessionFactory.getCurrentSession().saveOrUpdate(department);

	}
}
