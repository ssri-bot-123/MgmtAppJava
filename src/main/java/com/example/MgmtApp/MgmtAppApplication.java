package com.example.MgmtApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;

@SpringBootApplication(exclude = {SecurityAutoConfiguration.class} )
public class MgmtAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(MgmtAppApplication.class, args);
	}

}
