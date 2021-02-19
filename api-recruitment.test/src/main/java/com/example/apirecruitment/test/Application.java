package com.example.apirecruitment.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Bean
	public Docket swaggerConfiguration() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.example.apirecruitment.test"))
				.build()
				.apiInfo(apiDetails());
	}

	ApiInfo apiDetails() {
		return new ApiInfoBuilder()
				.title("Technical Test for PT GLI Recruitment")
				.description("as a response to https://api-docs.alfadigital.id/")
				.version("1.0.0")
				.contact(new Contact(
						"Jonathan Hardi",
						"https://www.linkedin.com/in/jonathan-hardi-321400107/",
						"jonathansen0@gmail.com"))
				.build();
	}
}