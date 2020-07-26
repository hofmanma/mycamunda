package com.mycamunda;

import org.camunda.bpm.spring.boot.starter.annotation.EnableProcessApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication(exclude = {
        org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class})
@EnableProcessApplication("myCamunda")
public class MyCamundaApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(MyCamundaApplication.class, args);
    }
}
