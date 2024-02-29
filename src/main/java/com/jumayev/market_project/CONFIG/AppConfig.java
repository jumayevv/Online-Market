package com.jumayev.market_project.CONFIG;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition
public class AppConfig {
    @Bean
    public OpenAPI openAPI(){
        return new OpenAPI().info(
                new Info().title("Authentication").contact(
                        new Contact().name("Boburjon Jumayev").email("boburjaan7@gmail.com").url("https://www.linkedin.com/in/boburjon-jumayev-87055822a/")
                ).description("this project is Online Market").version("2.0"));
    }
}
