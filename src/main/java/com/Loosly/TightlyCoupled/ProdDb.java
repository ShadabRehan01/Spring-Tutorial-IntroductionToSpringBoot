package com.Loosly.TightlyCoupled;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component //Creating the beans
//@Primary //Still Tightly System,You need to be go to the code and make One bean is to be primary
@ConditionalOnProperty(name="deploy.env",havingValue="Production")
public class ProdDb implements DB {
    public String getData(){
        return "Prod Data";
    }
}
