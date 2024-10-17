package com.example.tpspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.example.tpspring.repository")
@EntityScan(basePackages = "com.example.tpspring.model")
public class TpSpringApplication {

    public static void main(String[] args) {
        SpringApplication.run(TpSpringApplication.class, args);
    }

}
