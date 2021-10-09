package com.boot.service;

import java.util.HashMap;
import java.util.List;

import com.boot.dto.Employee;

public interface EmployeeService {

	List<Employee> selectCountries(HashMap<String, Object> paramMap) throws Exception;

}
