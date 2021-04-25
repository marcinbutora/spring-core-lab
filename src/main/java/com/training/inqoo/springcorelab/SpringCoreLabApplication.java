package com.training.inqoo.springcorelab;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;

@SpringBootApplication
public class SpringCoreLabApplication {

	@Bean
	@Profile("dev")
	Bean1Asc bean1Asc(){
		return new Bean1Asc();
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringCoreLabApplication.class, args);
	}

}
