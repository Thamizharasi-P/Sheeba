package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class Demo1Application {

    public static void main(String[] args) {
        SpringApplication.run(Demo1Application.class, args);
    }

    @GetMapping("/hello")
    public String sayHello(@RequestParam(value = "myName", defaultValue = "World") String name) {
        return String.format("Hello %s!", name);
    }

    @GetMapping("/age")
    public String sayAge(@RequestParam(value = "myAge", defaultValue = "00") int age) {
        return String.format("I am %s!", Integer.toString(age));
    }

    @PostMapping("/createMovie")
    public String createMovie(@RequestBody MovieDetails moviedetails) {
        return String.format("Movie name is %s", moviedetails.Name);
    }
}