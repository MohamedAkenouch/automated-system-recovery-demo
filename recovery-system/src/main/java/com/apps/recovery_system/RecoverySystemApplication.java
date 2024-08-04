package com.apps.recovery_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class RecoverySystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecoverySystemApplication.class, args);
	}

}