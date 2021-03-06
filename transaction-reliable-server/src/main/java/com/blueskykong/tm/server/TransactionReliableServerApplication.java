package com.blueskykong.tm.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class TransactionReliableServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(TransactionReliableServerApplication.class, args);
	}
}
