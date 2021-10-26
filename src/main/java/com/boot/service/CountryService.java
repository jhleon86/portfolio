package com.boot.service;

import java.util.HashMap;
import java.util.List;

import com.boot.dto.Country;
import com.boot.dto.Region;

public interface CountryService {

	List<Country> selectCountries(HashMap<String, Object> paramMap) throws Exception;

	int insertCountry(HashMap<String, Object> paramMap) throws Exception;

	HashMap<String, Object> selectCountries2(HashMap<String, Object> paramMap) throws Exception;

	List<Region> selectRegion() throws Exception;

}
