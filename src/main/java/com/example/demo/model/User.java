package com.example.demo.model;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class User {
	
	private String username;
	private String password;
	private String id;

}
