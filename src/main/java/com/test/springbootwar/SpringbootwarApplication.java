package com.test.springbootwar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class SpringbootwarApplication extends SpringBootServletInitializer {

    protected SpringApplicationBuilder config(SpringApplicationBuilder builder){
        return builder.sources(SpringbootwarApplication.class);
    }

    public static void main(String[] args) {

        SpringApplication.run(SpringbootwarApplication.class, args);
    }

}
