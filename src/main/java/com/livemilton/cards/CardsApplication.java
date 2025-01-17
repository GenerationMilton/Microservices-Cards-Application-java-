package com.livemilton.cards;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

import com.livemilton.cards.dto.CardsContactInfoDto;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;

@SpringBootApplication
/*
 * @ComponentScans({ @ComponentScan("com.eazybytes.cards.controller") })
 * 
 * @EnableJpaRepositories("com.eazybytes.cards.repository")
 * 
 * @EntityScan("com.eazybytes.cards.model")
 */
@EnableJpaAuditing(auditorAwareRef = "auditAwareImpl")
@EnableConfigurationProperties(value = { CardsContactInfoDto.class })
@OpenAPIDefinition(info = @Info(title = "Cards microservice REST API Documentation", description = "livemiltonBank Cards microservice REST API Documentation", version = "v1", contact = @Contact(name = "Milton Munoz", email = "livemilton@hotmail.com", url = "https://www.livemilton.com"), license = @License(name = "Apache 2.0", url = "https://www.livemilton.com")), externalDocs = @ExternalDocumentation(description = "livemiltonBank Cards microservice REST API Documentation", url = "https://www.livemilton.com/swagger-ui.html"))
public class CardsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CardsApplication.class, args);
	}
}