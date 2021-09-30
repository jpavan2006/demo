package com.company.demo;

import com.company.demo.service.DemoService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

	@Autowired
	private DemoService demoService;

	@Test
	void contextLoads() {
	}

	@Test
	public void testHello(){
		System.out.println("call to testHello()");
		assertEquals(Optional.of("Hello World"),demoService.hello("World"));
	}


	@Test
	public void testNameEmpty() {


		assertEquals(Optional.of("Please provide a name!"), demoService.hello(" "));

	}

	@Test
	public void testNameNull() {

		assertEquals(Optional.of("Please provide a name!"), demoService.hello(null));

	}



}
