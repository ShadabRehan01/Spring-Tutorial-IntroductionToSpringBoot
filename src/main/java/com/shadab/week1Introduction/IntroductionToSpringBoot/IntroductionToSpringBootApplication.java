package com.shadab.week1Introduction.IntroductionToSpringBoot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroductionToSpringBootApplication implements CommandLineRunner {
	@Autowired //beans are Injected, is called Field DependencyInjection used whenever required
	Apple apple1;
//	@Autowired
//	Apple apple2;

	@Override
	public void run(String... args) throws Exception { //NoStatic method by using variable args
		apple1.eatApple();
	//	apple2.eatApple();

		System.out.println(apple1.hashCode());
	//	System.out.println(apple2.hashCode());
	}
	public static void main(String[] args) { //static
		SpringApplication.run(IntroductionToSpringBootApplication.class, args);
	}
}
