package com.hotelpp.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class HotelappServiceDiscoveryApplication {

	public static void main(String[] args) {
		SpringApplication.run(HotelappServiceDiscoveryApplication.class, args);
	}

}
