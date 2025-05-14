package com.example.demo;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {
    @Bean
    @Qualifier("maruti")
    public Vehicle marutiVehicle(){
        return new Maruti();
    }

    @Bean
    @Qualifier("hyundai")
    public Vehicle HyundaiVehicle(){
        return new Hyundai();
    }
}
