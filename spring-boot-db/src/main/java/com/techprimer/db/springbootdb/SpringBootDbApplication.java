package com.techprimer.db.springbootdb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.techprimer.db.springbootdb.repository")
@SpringBootApplication
public class SpringBootDbApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDbApplication.class, args);
	}
}
