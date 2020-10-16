package com.curso.spingboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = "com.curso.spingboot.model")
@ComponentScan(basePackages = {"com.curso.*"})
@EnableJpaRepositories(basePackages = {"com.curso.spingboot.repository"})
public class CursodeSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(CursodeSpringBootApplication.class, args);
	}

}
