package com.samsung;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.web.bind.annotation.RequestParam;

// url h2 консоли: http://localhost:8090/h2-console
// url базы: jdbc:h2:mem:testdb

@SpringBootApplication
public class LibraryApp {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(LibraryApp.class, args);
    }
}
