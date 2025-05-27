package com.api.dataforge;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DataForgeApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataForgeApiApplication.class, args);
	}

}
