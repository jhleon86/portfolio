package com.boot.repository;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.boot.dto.Country;

@Mapper
public interface CountryMapper {
	List<Country> selectCountries(HashMap<String,Object> map);
}
