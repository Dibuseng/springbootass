package com.enviro.assessment.grad001.dibusengdikgoele.springbootassessments.springbootassessment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@Configuration
@EnableAutoConfiguration
@EnableJpaRepositories
@ComponentScan("module-service")
public class SpringbootassessmentApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootassessmentApplication.class, args);
	}

}
