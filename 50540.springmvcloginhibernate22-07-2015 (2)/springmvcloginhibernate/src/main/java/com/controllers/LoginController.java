package com.controllers;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.form.LoginForm;
import com.model.Department;
import com.service.*;

import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Map;
import javax.validation.Valid;


@Controller

//@RequestMapping("loginform.html")
public class LoginController {

	
	@Autowired
	public LoginService loginService;
	
	@Autowired
	private DepartmentService departmentService;


	@RequestMapping(method = RequestMethod.GET)
	public String showForm(Map model) {
		LoginForm loginForm = new LoginForm();
		model.put("loginForm", loginForm);
		return "loginform";
	}

	@RequestMapping(method = RequestMethod.POST)
	public String processForm(@Valid LoginForm loginForm, BindingResult result,
			Map model) {

		
		if (result.hasErrors()) {
			return "loginform";
		}
		
		/*
		String userName = "UserName";
		String password = "password";
		loginForm = (LoginForm) model.get("loginForm");
		if (!loginForm.getUserName().equals(userName)
				|| !loginForm.getPassword().equals(password)) {
			return "loginform";
		}
		*/
		boolean userExists = loginService.checkLogin(loginForm.getUserName(),loginForm.getPassword());
		if(userExists){
			model.put("loginForm", loginForm);
			return "loginsuccess1";
		}else{
			result.rejectValue("userName","invaliduser");
			return "loginform";
		}

	}
	
	
	

	  @RequestMapping(value = "/newDepartment", method = RequestMethod.GET) 
	  public ModelAndView newContact(ModelAndView model) {
	  System.out.println("Inside newDepartment...."); 
	  Department department= new Department();
	  model.addObject("department", department);
	  model.setViewName("loginsuccess"); 
	  return model; 
	  }
  
	  @RequestMapping(value = "/saveDepartment", method = RequestMethod.POST)
		public ModelAndView saveDept(@ModelAttribute Department department)
	  {
		  System.out.println("inside save department..."+department.getId());
	if (department.getId() == 0) { // if employee id is 0 then creating the
				// employee other updating the employee
				departmentService.addDepartment(department);
		
			} 
		else {
		//	departmentService.updateDepartment(department);
		}
			return new ModelAndView("viewrecords");
		}
	 

}
