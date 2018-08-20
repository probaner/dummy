package com.ericsson.eai.EAI;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages= {"com.ericsson.eai"})
public class EaiApplication {

	public static void main(String[] args) {
		SpringApplication.run(EaiApplication.class, args);
	}
}
