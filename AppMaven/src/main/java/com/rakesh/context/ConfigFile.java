package com.rakesh.context;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
public class ConfigFile {
	@Bean
	public DriverManagerDataSource crud() {
		DriverManagerDataSource ds=new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/adit");
		ds.setUsername("root");
		ds.setPassword("123456");
		return ds;
	}
	
	@Bean
	public JdbcTemplate jT() {
		JdbcTemplate jT=new JdbcTemplate();
		jT.setDataSource(crud());
		return jT;
	}
	
}
