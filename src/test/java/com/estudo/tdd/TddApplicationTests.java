package com.estudo.tdd;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.security.RunAs;


@SpringBootTest
@ActiveProfiles("test")
@RunWith(SpringRunner.class)
class TddApplicationTests {

	@Test
	void contextLoads() {
	}

}
