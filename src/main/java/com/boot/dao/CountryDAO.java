package com.boot.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.boot.dto.Country;
import com.boot.dto.Region;

@Mapper
public interface CountryDAO {
	List<Country> selectCountries(HashMap<String,Object> paramMap) throws Exception;
	List<Region> selectRegion() throws Exception;
	int insertCountry(HashMap<String,Object> paramMap) throws Exception;
}
