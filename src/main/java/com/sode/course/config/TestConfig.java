package com.sode.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.sode.course.entities.User;
import com.sode.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		 
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "99999999999999", "123456");
		User u2 = new User(null, "Liam Brown", "liam@gmail.com", "111111111111111", "12312321");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
		
	}
	
	
	

}
