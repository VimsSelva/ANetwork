package com.tea.teashop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration
@ComponentScan(basePackages={"com.tea.*"}) 
public class TeashopApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeashopApplication.class, args);
	}
}
