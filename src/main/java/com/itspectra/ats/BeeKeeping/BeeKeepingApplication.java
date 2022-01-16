package com.itspectra.ats.BeeKeeping;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration

@SpringBootApplication
@RequestMapping(path="ap")
public class BeeKeepingApplication {
	@Bean
	public Docket docket(){
		return new Docket(DocumentationType.SWAGGER_2).select().apis(RequestHandlerSelectors.basePackage("mapoto")).build();
	}

	public static void main(String[] args) {
		SpringApplication.run(BeeKeepingApplication.class, args);
	}



}
