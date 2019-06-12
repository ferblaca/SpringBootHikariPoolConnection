package com.example.demoTestHikari;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
public class ConfigurationApp {

	@Bean
	@Primary
	@ConfigurationProperties(prefix = "spring.datasource")
	public DataSource primaryDataSource() {
		DataSource datasourdeHikari = DataSourceBuilder.create().build();
		return datasourdeHikari;
	}

	@Bean
	@Primary
	public JdbcTemplate primaryJdbcTemplate(final DataSource primaryDataSource) {
		return new JdbcTemplate(primaryDataSource);
	}

}
