package com.Loosly.TightlyCoupled;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

//Dependencies are injected into a Component
@Service //Provide Business Functionality
public class DBService {
    @Autowired //beans are Injected, is called Field DependencyInjection used whenever required
 //   private DevDb devDb; //It implements the Tightly Coupled System for DevDb you have to modify,
                        // if you want to make Loosely Coupled System.

    private DB db;
    String getData(){
        return db.getData();
    }
}
