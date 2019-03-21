package com.in28minutes.microservices.currencyexchangeservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import springfox.documentation.swagger2.annotations.EnableSwagger2;
import brave.sampler.Sampler;

@SpringBootApplication
@EnableDiscoveryClient
@EnableSwagger2
public class CurrencyExchangeServiceApplication {

	// The following bean configuration is for Zipkin
	@Bean
	public Sampler defaultSampler(){
		return Sampler.ALWAYS_SAMPLE;
	}
	
	public static void main(String[] args) {

		SpringApplication.run(CurrencyExchangeServiceApplication.class, args);
	}

}

