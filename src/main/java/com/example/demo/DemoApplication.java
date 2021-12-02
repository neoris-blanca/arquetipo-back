package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.mappers.IUserMapper;

@SpringBootApplication
public class DemoApplication {
	
	@Autowired
	IUserMapper userMapper;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
