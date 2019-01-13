package com.cg.app.employee.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.app.employee.DAO.EmployeeDAO;
import com.cg.app.employee.pojo.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	EmployeeDAO employeedao;
	
	@Override
	public void addNewEmployee(Employee employee) {
		employeedao.addNewEmployee(employee);
		
	}

}
