package com.shadab.week1Introduction.IntroductionToSpringBoot;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigApple {
   // @Scope("singleton")
    //@Scope("prototype")
    @Bean  //Part of Spring core container,Enable dependency injection and IOC
    Apple getApple(){
        return new Apple();
    }
}

