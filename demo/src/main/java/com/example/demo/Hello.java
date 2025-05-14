package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Vehicle;

@RestController
public class Hello {

    @Autowired()
    @Qualifier("hyundai")
    private Vehicle vehicle;

    @GetMapping("/get")
    public String SayHello(){
        return "hello-world" + vehicle.getColor();
    }
}
