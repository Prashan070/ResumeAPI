package com.resumeapi;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info = @Info(
				title = "Prashan Kumar Srivastava",
				description = "Senior Software Engineer",
				version = "V1",
				contact = @Contact(
						name="Prashan",
						email = "prashansrivastava77@gmail.com"
				)

		),
		externalDocs = @ExternalDocumentation(
				description = "Resume service API"
		)

)
public class ResumeApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ResumeApiApplication.class, args);
	}

}
