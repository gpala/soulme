package com.srai.inout.db;

import javax.persistence.EntityManagerFactory;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@EnableJpaRepositories(entityManagerFactoryRef = "integEntityManagerFactory", transactionManagerRef = "integTransactionManager", basePackages = {
		"com.srai.inout.repositories" })

public class HBDBConfig {

	@Primary
	@Bean(name = "integDataSource")
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource integDataSource() {
		return DataSourceBuilder.create().build();
	}

	@Primary
	@Bean(name = "integEntityManagerFactory")
	public LocalContainerEntityManagerFactoryBean entityManagerFactory(EntityManagerFactoryBuilder builder,
			@Qualifier("integDataSource") DataSource dataSource) {
		return builder.dataSource(dataSource).packages("com.srai.inout.repositories").build();
	}

	@Primary
	@Bean(name = "integTransactionManager")
	public PlatformTransactionManager integTransactionManager(
			@Qualifier("integEntityManagerFactory") EntityManagerFactory integEntityManagerFactory) {
		return new JpaTransactionManager(integEntityManagerFactory);
	}

}
