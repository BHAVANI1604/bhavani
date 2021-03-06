package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.cloud.netflix.zuul.EnableZuulServer;
@EnableDiscoveryClient
@SpringBootApplication
@EnableZuulProxy
public class Bhavani1Application {

	public static void main(String[] args) {
		SpringApplication.run(Bhavani1Application.class, args);
	}

}
