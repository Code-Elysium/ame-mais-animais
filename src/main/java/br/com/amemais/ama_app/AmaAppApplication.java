package br.com.amemais.ama_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = { DataSourceAutoConfiguration.class })
public class AmaAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(AmaAppApplication.class, args);
	}

}
