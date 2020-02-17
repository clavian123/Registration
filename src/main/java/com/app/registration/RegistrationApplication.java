package com.app.registration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.app.repository.UserRepo;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.app.repository")
public class RegistrationApplication {
	

	public static void main(String[] args) throws Exception {
		SpringApplication.run(RegistrationApplication.class, args);
		System.out.println("Hi");
	}

}
