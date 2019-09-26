package com.dg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.dg.dao")
@SpringBootApplication
public class App {

	public static void main(String[] args) {
		
		SpringApplication.run(App.class, args);

	}

}
