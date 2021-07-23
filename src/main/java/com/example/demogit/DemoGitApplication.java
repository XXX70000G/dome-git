package com.example.demogit;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
@ServletComponentScan
public class DemoGitApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoGitApplication.class, args);
    }

}
