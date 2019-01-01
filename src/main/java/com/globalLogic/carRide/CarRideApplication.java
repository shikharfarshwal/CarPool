package com.globalLogic.carRide;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients("com.globalLogic.carRide")
@EnableDiscoveryClient
public class CarRideApplication {

    public static void main(String[] args) {
        SpringApplication.run(CarRideApplication.class, args);
    }
}
