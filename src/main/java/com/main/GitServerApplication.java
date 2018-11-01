package com.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitServerApplication.class, args);

	}

	public static void text(){

		System.out.print("第一个程序");
	}

}
