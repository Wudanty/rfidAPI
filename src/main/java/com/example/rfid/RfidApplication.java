package com.example.rfid;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"com.example.rfid.services", "com.example.rfid.controllers"})
public class RfidApplication {

    public static void main(String[] args) {
        SpringApplication.run(RfidApplication.class, args);
    }

}
