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

	public static void text1(){

		System.out.print("第二个程序第二个程序第二个程序第二个程序第二个程序第二个程序BUG");
	}

	public static void text2(){
		System.out.print("开发2.0");
	}

}
