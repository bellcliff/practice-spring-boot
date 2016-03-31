package com.msi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

/**
 * Created by Bo-yang on 3/31/2016.
 */
@SpringBootApplication
public class HelloApplication {
    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication
                .run(HelloApplication.class, args);
    }
}
