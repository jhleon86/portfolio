package com.boot;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
 
@SpringBootApplication
@MapperScan(basePackages={"com.boot.dao"})
public class BootApplication {
	 
	public static void main(String[] args) {	
		SpringApplication.run(BootApplication.class, args);
	}
	
	@Bean 
	public SqlSessionFactory sqlSessionFactory(DataSource dataSource, ApplicationContext applicationContext) throws Exception {
		
		SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
		sessionFactory.setDataSource(dataSource);
		sessionFactory.setConfigLocation(applicationContext.getResource("classpath:mybatis-config.xml"));
		Resource[] res = new PathMatchingResourcePatternResolver().getResources("classpath:mapper/*Mapper.xml");
		sessionFactory.setMapperLocations(res); 
		 
		return sessionFactory.getObject();
	}
}
