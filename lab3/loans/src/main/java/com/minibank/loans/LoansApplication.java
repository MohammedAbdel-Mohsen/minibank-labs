package com.minibank.loans;

import com.netflix.discovery.EurekaNamespace;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableFeignClients
@EnableJpaAuditing
@OpenAPIDefinition(
		info = @Info(
				title = "Bank Management System : Loans API",
				version = "1.0",
				description = "API for managing Loans",
				contact = @Contact(
						name = "Muhammad Elnawam",
						email = "mohamed.abdelmohsen@cis.asu.edu.eg"
				)
		)
)
public class LoansApplication {

	public static void main(String[] args) {
		SpringApplication.run(LoansApplication.class, args);
	}

}