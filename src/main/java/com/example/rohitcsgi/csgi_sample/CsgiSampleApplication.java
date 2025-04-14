package com.example.rohitcsgi.csgi_sample;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.servers.Server;

@SpringBootApplication
public class CsgiSampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CsgiSampleApplication.class, args);
	}

@Bean
   public OpenAPI defineOpenApi() {
       Server server = new Server();
       server.setUrl("http://localhost:8080");
       server.setDescription("Development");

       Contact myContact = new Contact();
       myContact.setName("Rohit Tonk");
       myContact.setEmail("Rohitto201124@gmail.com");

       Info information = new Info()
               .title("Words count in a sample file")
               .version("1.0")
               .description("This API exposes endpoints to read a file and provides the response .")
               .contact(myContact);
       return new OpenAPI().info(information).servers(List.of(server));
}

}
