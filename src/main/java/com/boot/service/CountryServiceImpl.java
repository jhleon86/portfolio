package com.boot.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.dao.CountryDAO;
import com.boot.dto.Country;

@Service
public class CountryServiceImpl implements CountryService {
	
	@Autowired
	private CountryDAO countryDAO;
	
	@Override
	public List<Country> selectCountries(HashMap<String,Object> paramMap) throws Exception {  
		
		List<Country> selectCountries = countryDAO.selectCountries(paramMap);
		
		return selectCountries;
	}
	
}
