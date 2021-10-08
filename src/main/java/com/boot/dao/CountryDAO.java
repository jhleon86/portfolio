package com.boot.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.boot.dto.Country;

@Mapper
public interface CountryDAO {
	List<Country> selectCountries(HashMap<String,Object> paramMap) throws Exception;
}
