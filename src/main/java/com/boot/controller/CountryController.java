package com.boot.controller;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.boot.service.CountryService;

@Controller
@RequestMapping("/sample*")
public class CountryController {

	@Autowired
	private CountryService countryService;

	@GetMapping("/country-list")
	public String countryList(@RequestParam HashMap<String,Object> paramMap, Model model) throws Exception {
		
//		model.addAttribute("list", countryService.selectCountries(paramMap));
		model.addAttribute("list", countryService.selectCountries2(paramMap));
		return "/sample/country-list";
	}
	
	@GetMapping("/country-add")
	public String countryAdd(@RequestParam HashMap<String,Object> paramMap, Model model) throws Exception {  
		
		model.addAttribute("rlist",countryService.selectRegion());
		
		return "/sample/country-add";
	}
	
	@GetMapping("/country-add-ajax")
	public String countryAddAjax(@RequestParam HashMap<String,Object> paramMap, Model model) throws Exception {  
		
		return "/sample/country-add-ajax";
	}
	
	/**
	 * 나라 저장
	 */
	@PostMapping("/country-add/insert")
	public String countryAddInsert(@RequestParam HashMap<String,Object> paramMap, Model model) throws Exception {  
		
		int insert_cnt = countryService.insertCountry(paramMap);
		
		model.addAttribute("cnt", insert_cnt);
	 
		return "redirect:/sample/country-list";
	}
	
	/**
	 * 나라 저장(ajax)
	 */
	@ResponseBody
	@PostMapping("/country-add/insert/ajax")
	public HashMap<String,Object> countryAddInsertAjax(@RequestParam HashMap<String,Object> paramMap) throws Exception {  
		
		int insert_cnt = countryService.insertCountry(paramMap);
		HashMap<String,Object> resultMap = new HashMap<String,Object>();
		resultMap.put("cnt", insert_cnt);
	 
		return resultMap;
	}
	
//	@RequestMapping("/country-edit")
//	public String countryEdit(@RequestParam HashMap<String,Object> paramMap, Model model) throws Exception {
//		return "/sample/country-edit";
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
