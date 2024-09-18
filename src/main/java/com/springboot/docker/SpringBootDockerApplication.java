package com.springboot.docker;

import org.apache.logging.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import jakarta.annotation.PostConstruct;

@SpringBootApplication
@RestController
public class SpringBootDockerApplication {
	
//	@GetMapping("/message")
//	public String getmessage() {
//		return "Helloo Docker !!";
//	}
	public static org.slf4j.Logger logger =  LoggerFactory.getLogger(SpringBootDockerApplication.class);

	@PostConstruct
	public void intt() {
		logger.info("Application Satrted...");
		logger.info("Checking build pipeline Satrted...");
	}
	public static void main(String[] args) {
		logger.info("Application executed... and its ok");
		SpringApplication.run(SpringBootDockerApplication.class, args);
		
		
	}

}
