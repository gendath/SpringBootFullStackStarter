package com.perbear.FullStackStarter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class FullStackApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = (ApplicationContext) SpringApplication.run(FullStackApplication.class, args);


    }
}
