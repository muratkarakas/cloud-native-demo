package com.eteration.cloud.demo.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication(scanBasePackages="com.eteration.cloud.demo")
@EnableConfigServer
public class ConfigServerApplcation {
	
	
	public static void main(String[] args) {
		SpringApplication.run(ConfigServerApplcation.class, args);
	}

}
