package com.company.demo.service;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class DemoServiceTest {

    @Autowired
    private DemoService demoService;

    @Test
    void contextLoads() {
    }

    @Test
    public void testHello(){
        System.out.println("call to testHello() in DemoServiceTest");
        assertEquals(Optional.of("Hello World"),demoService.hello("World"));
    }

}