package com.boot.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.boot.dto.Employee;

@Mapper
public interface EmployeeDAO {
	List<Employee> selectEmployee(HashMap<String,Object> paramMap) throws Exception;
}
