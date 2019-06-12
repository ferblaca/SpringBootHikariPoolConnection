package com.example.demoTestHikari;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoTestHikariApplication implements CommandLineRunner {

	@Autowired
	private DataSource dataSource;

	public static void main(String[] args) {
		SpringApplication.run(DemoTestHikariApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Connection Polling datasource : " + dataSource); // check connection pooling
	}

}
