package com.example.springprepare;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringPrepareApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringPrepareApplication.class, args);
    }

}
