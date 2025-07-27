package com.Loosly.TightlyCoupled;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component  // Component Creating the beans
@ConditionalOnProperty(name="deploy.env",havingValue = "development")
public class DevDb implements DB{
   public String getData(){
        return "Dev Data";
    }
}
