package com.springcore.SpEL;

import org.springframework.context.annotation.Bean;

public class Config {
	@Bean("t")
	public Test getTest() {
		return new Test();
	}

}
