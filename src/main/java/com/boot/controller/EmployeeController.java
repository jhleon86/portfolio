package com.boot.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.boot.service.EmployeeService;

@Controller
@RequestMapping("/sample*")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@RequestMapping("/employee-list")
	public String EmployeeList(@RequestParam HashMap<String,Object> paramMap, Model model) throws Exception {
		model.addAttribute("list", employeeService.selectCountries(paramMap));
		return "/sample/employee-list";
	}
	
	@RequestMapping("/employee-edit")
	public String EmployeeEdit(@RequestParam HashMap<String,Object> paramMap, Model model) throws Exception {
		model.addAttribute("list", employeeService.selectCountries(paramMap));
		return "/sample/employee-edit";
	}
	
//	@RequestMapping("/EmployeeDelete")
//	public String EmployeeDelete(@RequestParam HashMap<String,Object> paramMap, Model model) throws Exception {  
//		
//		//EmployeeDAO.selectCountries(paramMap);
//	 
//		return "Employee";
//	}
	
	
//	@ResponseBody
//	@RequestMapping("/ajax/countries")
//	public HashMap<String,Object> ajaxEmployee(@RequestParam HashMap<String,Object> paramMap) throws Exception {  
//		final List<EmployeeDTO> EmployeeList = EmployeeDAO.selectCountries(paramMap);
//		
//		HashMap<String,Object> resultMap = new HashMap<String,Object>();
//		resultMap.put("EmployeeList", EmployeeList);
//		
//		return resultMap;
//	}
}
