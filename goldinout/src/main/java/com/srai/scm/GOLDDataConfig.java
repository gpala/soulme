package com.srai.scm;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GOLDDataConfig {

	@Value("${gold.lang:GB}")
	public String LANG;
	
	@Bean(name = "goldDataSource")
	@ConfigurationProperties(prefix = "gold.datasource")
	public DataSource goldDataSource() {
		return DataSourceBuilder.create().build();
	}
	/*
	 * 
	 * @Bean(name = "goldEntityManagerFactory") public
	 * LocalContainerEntityManagerFactoryBean barEntityManagerFactory(
	 * EntityManagerFactoryBuilder builder,
	 * 
	 * @Qualifier("goldDataSource") DataSource dataSource ) { return builder
	 * .dataSource(dataSource) .packages("com.srai.scm") .persistenceUnit("db2")
	 * .build(); }
	 * 
	 * @Bean(name = "goldTransactionManager") public PlatformTransactionManager
	 * goldTransactionManager(
	 * 
	 * @Qualifier("goldEntityManagerFactory") EntityManagerFactory
	 * goldEntityManagerFactory ) { return new
	 * JpaTransactionManager(goldEntityManagerFactory); }
	 */	 
}
