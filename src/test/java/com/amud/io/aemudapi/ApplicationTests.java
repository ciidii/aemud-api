package com.amud.io.aemudapi;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {
	@BeforeEach
	void setUp() {
		System.out.println("before each test");
	}

	@AfterEach
	void tearDown() {

	}

	@Test
	void contextLoads() {
		System.out.println("contextLoads");
	}

	@Test
	void test() {
		System.out.println("test");
	}
}
