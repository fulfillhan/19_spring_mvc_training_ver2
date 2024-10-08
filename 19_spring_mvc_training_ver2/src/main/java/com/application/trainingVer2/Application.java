package com.application.trainingVer2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling  // 스케줄링 가능
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
