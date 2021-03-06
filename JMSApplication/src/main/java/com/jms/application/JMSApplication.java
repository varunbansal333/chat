package com.jms.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.jms.application", "com.jms.handlers", "com.jms.helpers", "com.jms.services"})

public class JMSApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(JMSApplication.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(JMSApplication.class);
	}
}
