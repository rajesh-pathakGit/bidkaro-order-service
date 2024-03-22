package com.org.bidkro.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;


@SpringBootApplication
@EnableDiscoveryClient
public class BidkaroOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BidkaroOrderServiceApplication.class, args);
	}

}
