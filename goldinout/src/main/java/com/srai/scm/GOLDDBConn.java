package com.srai.scm;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

@Component
public class GOLDDBConn {

	@Autowired
	@Qualifier("goldDataSource")
	private DataSource goldDataSource;
	
	@Bean(name="goldJdbcTemlate")	
	private JdbcTemplate getJdbcTemplate() {
		return new JdbcTemplate(goldDataSource);
	}
	
}
