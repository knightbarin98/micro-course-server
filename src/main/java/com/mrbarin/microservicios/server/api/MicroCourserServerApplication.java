package com.mrbarin.microservicios.server.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;


@EnableEurekaServer
@SpringBootApplication
public class MicroCourserServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MicroCourserServerApplication.class, args);
	}

}
