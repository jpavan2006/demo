package com.company.demo.service;

import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DemoService {

    public Optional<String> hello(String name){

        System.out.println("name passed"+name);
        StringBuilder result = new StringBuilder();

        if (name == null || name.trim().length() == 0) {

            result.append("Please provide a name!");

        } else {

            result.append("Hello " + name);

        }
        System.out.println("result.toString()"+result.toString());
        return Optional.of(result.toString());
    }
}
