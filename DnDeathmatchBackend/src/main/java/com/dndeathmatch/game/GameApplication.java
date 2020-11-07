package com.dndeathmatch.game;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GameApplication {

	public static void main(String[] args) {
		System.out.println("Running...");
		SpringApplication.run(GameApplication.class, args);
	}

}