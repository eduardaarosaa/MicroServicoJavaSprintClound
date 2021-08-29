package com.dio.santander.botcamp.ussconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class UssConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(UssConfigServerApplication.class, args);
	}

}
