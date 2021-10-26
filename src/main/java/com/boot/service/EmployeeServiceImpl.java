package com.boot.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.dao.EmployeeDAO;
import com.boot.dto.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeDAO employeeDAO;
	
	@Override
	public List<Employee> selectEmployee(HashMap<String,Object> paramMap) throws Exception {  
		
		List<Employee> selectCountries = employeeDAO.selectEmployee(paramMap);
		
		return selectCountries;
	}
	
}
