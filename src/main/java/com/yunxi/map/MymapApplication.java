package com.yunxi.map;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@MapperScan("com.yunxi.map.dao")
//@EnableAutoConfiguration

public class MymapApplication {

	public static void main(String[] args) {
		SpringApplication.run(MymapApplication.class, args);
	}
}
