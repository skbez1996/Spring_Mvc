package com.cg.myprojectspringmvc.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.hibernate5.HibernateTransactionManager;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/*My Project*/

@Configuration
@PropertySource("classpath:resources/mysql.properties")
@ComponentScan("com.cg.myprojectspringmvc")
@EnableTransactionManagement
public class AppContexts {
	@Autowired
	Environment environment;
	

	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setPackagesToScan(new String[] {"com.cg.myprojectspringmvc.dto"});
		sessionFactory.setHibernateProperties(hibernateProperties());
		return sessionFactory;
	}
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(environment.getRequiredProperty("mysql.driver"));
		dataSource.setUrl(environment.getRequiredProperty("mysql.url"));
		dataSource.setUsername(environment.getRequiredProperty("mysql.username"));
		dataSource.setPassword(environment.getRequiredProperty("mysql.password"));
		return dataSource;

	}

		private Properties hibernateProperties() {
			Properties properties = new Properties();
			properties.put("hibernate.dialect", environment.getRequiredProperty("mysql.dialect"));
			properties.put("hibernate.hbm2ddl.auto", environment.getRequiredProperty("mysql.auto"));
			properties.put("hibernate.format_sql",true);
			return properties;}
	
			

			@Bean
			public HibernateTransactionManager getTransactionManager() {
				HibernateTransactionManager transactionManager = new HibernateTransactionManager();
				transactionManager.setSessionFactory(sessionFactory().getObject());
				return transactionManager;
			}
	
}
