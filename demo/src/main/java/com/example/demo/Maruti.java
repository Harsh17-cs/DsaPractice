package com.example.demo;
import org.springframework.beans.factory.annotation.Qualifier;

import org.springframework.stereotype.Component;

@Component
public class Maruti implements Vehicle {
    @Override
    public String getColor() {
        return "white";
    }
}
