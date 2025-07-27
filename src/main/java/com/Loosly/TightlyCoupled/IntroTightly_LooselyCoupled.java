package com.Loosly.TightlyCoupled;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class IntroTightly_LooselyCoupled implements CommandLineRunner {
    @Autowired //beans are Injected, is called Field DependencyInjection used whenever required
    DBService db;

    @Override
    public void run(String... args) throws Exception {
        System.out.println(db.getData());
    }
    public static void main(String[] args) {
        SpringApplication.run(IntroTightly_LooselyCoupled.class,args);
    }
}

