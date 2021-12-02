package com.example.demo.mappers;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.model.User;

@SpringBootTest
public class UserMapperTest {
	
	@Autowired
    IUserMapper userMapper;
	
	@BeforeEach
	void setup() {
	  // setup tasks like populating sample data
	}
	 
	@AfterEach
	void tearDown() {
	  // cleanup tasks like deleting database rows
	}

    @Test
    public void shouldReturnUserWithGivenId() {
    	assertNotNull(userMapper);
        User user = userMapper.getUser(1L);

        assertNotNull(user);
        assertEquals(user.getId(), 1L);
        assertEquals(user.getUsername(), "test");
    }

}
