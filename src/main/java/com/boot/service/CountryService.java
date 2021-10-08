package com.boot.service;

import java.util.HashMap;
import java.util.List;

import com.boot.dto.Country;

public interface CountryService {

	List<Country> selectCountries(HashMap<String, Object> paramMap) throws Exception;

}
