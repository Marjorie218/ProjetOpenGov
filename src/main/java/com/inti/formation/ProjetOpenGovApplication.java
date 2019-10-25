package com.inti.formation;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.web.config.EnableSpringDataWebSupport;

import com.inti.formation.entity.Citizen;

import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableSwagger2
public class ProjetOpenGovApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ProjetOpenGovApplication.class, args);

	}
	
	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("com.inti.formation")).build();
	}
	// http://localhost:8082/swagger-ui.html#
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
