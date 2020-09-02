package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class DemoApplication {

	private static  final Logger log = (Logger) LoggerFactory.getLogger(SpringApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@Bean
	CommandLineRunner runner (){
		return args ->  {
			log.error("Error");
			log.warn("warn");
			log.info("info");
			log.debug("debug");
			log.trace("trace");
		};
	}


}
