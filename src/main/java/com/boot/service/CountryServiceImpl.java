package com.boot.service;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.dao.CountryDAO;
import com.boot.dto.Country;
import com.boot.dto.Region;

@Service
public class CountryServiceImpl implements CountryService {
	
	@Autowired
	private CountryDAO countryDAO;
	
	@Override
	public List<Country> selectCountries(HashMap<String,Object> paramMap) throws Exception {  
		
		List<Country> selectCountries = countryDAO.selectCountries(paramMap);
		
		return selectCountries;
	}
	
	@Override
	public HashMap<String,Object> selectCountries2(HashMap<String,Object> paramMap) throws Exception {  
		
		HashMap<String,Object> resultMap = new HashMap<String,Object>();
		//나라리스트조회
		List<Country> selectCountry = countryDAO.selectCountries(paramMap);
		//대륙리스트조회
//		List<Region> selectRegion = countryDAO.selectRegion();
		
		resultMap.put("country", selectCountry);
		resultMap.put("region", countryDAO.selectRegion());
		
		return resultMap;
	}
	 
	@Override
	public List<Region> selectRegion() throws Exception {   
		List<Region> selectRegion = countryDAO.selectRegion(); 
		return selectRegion;
	}
	
	
	@Override
	public int insertCountry(HashMap<String,Object> paramMap) throws Exception {
		return countryDAO.insertCountry(paramMap);
	}
	
}
