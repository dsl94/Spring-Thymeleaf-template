package com.intisa.intisia;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class IntisiaApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(IntisiaApplication.class, args);
	}
}
