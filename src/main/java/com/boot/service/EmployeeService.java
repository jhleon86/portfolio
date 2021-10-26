package com.boot.service;

import java.util.HashMap;
import java.util.List;

import com.boot.dto.Employee;

public interface EmployeeService {

	List<Employee> selectEmployee(HashMap<String, Object> paramMap) throws Exception;

}
