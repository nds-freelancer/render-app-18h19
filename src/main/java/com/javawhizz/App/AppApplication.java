package com.javawhizz.App;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.store.dao.impl.UserDAOImpl;

@SpringBootApplication
@RestController
public class AppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AppApplication.class, args);
	}
	
	UserDAOImpl daoImpl = new UserDAOImpl();
	
	
	@GetMapping("/")
	String home() {
		
		return "Spring is here 09-05!"+daoImpl.listCake(1).getUsername();
	}
	
}
