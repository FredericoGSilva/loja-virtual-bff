package com.project.lojavirtualbff;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class LojavirtualbffApplication {

	public static void main(String[] args) {
		SpringApplication.run(LojavirtualbffApplication.class, args);
	}

}
