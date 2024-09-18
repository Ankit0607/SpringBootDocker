package com.springboot.docker;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootDockerApplicationTests {

	public static Logger logger = (Logger) LoggerFactory.getLogger(SpringBootDockerApplication.class);

	@Test
	void contextLoads() {
		logger.info("test executed....");
		logger.info("test Passed....");
		assertEquals(true, true);
	}

}
