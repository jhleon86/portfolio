package com.boot.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.boot.service.CountryService;

@Controller
@RequestMapping("/sample*")
public class CountryController {

	@Autowired
	private CountryService countryService;

	@RequestMapping("/country-list")
	public String country(@RequestParam HashMap<String,Object> paramMap, Model model) throws Exception {
		model.addAttribute("list", countryService.selectCountries(paramMap));
		return "/sample/country-list";
	}
	
//	@RequestMapping("/countryDelete")
//	public String countryDelete(@RequestParam HashMap<String,Object> paramMap, Model model) throws Exception {  
//		
//		//countryDAO.selectCountries(paramMap);
//	 
//		return "country";
//	}
	
	
//	@ResponseBody
//	@RequestMapping("/ajax/countries")
//	public HashMap<String,Object> ajaxCountry(@RequestParam HashMap<String,Object> paramMap) throws Exception {  
//		final List<CountryDTO> countryList = countryDAO.selectCountries(paramMap);
//		
//		HashMap<String,Object> resultMap = new HashMap<String,Object>();
//		resultMap.put("countryList", countryList);
//		
//		return resultMap;
//	}
}
