package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class Hyundai implements Vehicle{
    @Override
    public String getColor() {
        return "black";
    }
}
