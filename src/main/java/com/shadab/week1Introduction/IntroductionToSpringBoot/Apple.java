package com.shadab.week1Introduction.IntroductionToSpringBoot;

//@Component   // you can Create the beans
//@Service //it is used to provide business functionalities
//@Repository //help to easily retrieve,update and delete content in database

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

//@Component
public class Apple {
    void eatApple(){
        System.out.println("I am eating the apple");
    }
    @PostConstruct //used on a method that need to execute after dependency injection is done
    void callThisBeforeAppleIsUsed(){
        System.out.println("Creating the Apple before Use");
    }
    @PreDestroy
    void callThisBeforeAppleDestroy(){
        System.out.println("Destroying the Apple bean");
    }
    //For Destroying bean you have to Close the Spring boot Application
}
