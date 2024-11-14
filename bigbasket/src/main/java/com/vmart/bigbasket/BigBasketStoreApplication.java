package com.vmart.bigbasket;

import com.vmart.bigbasket.service.SampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BigBasketStoreApplication implements CommandLineRunner {

	@Autowired
	private SampleService sampleService;

	public static void main(String[] args) {
		SpringApplication.run(BigBasketStoreApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		sampleService.showAllProduct();
	}
}
