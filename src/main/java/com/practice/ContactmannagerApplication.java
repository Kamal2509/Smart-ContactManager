package com.practice;

import com.practice.Entity.User;
import com.practice.dao.UserRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import javax.naming.Context;

@SpringBootApplication
public class ContactmannagerApplication {

	public static void main(String[] args) {

		SpringApplication.run(ContactmannagerApplication.class, args);

		/*UserRepository userRepository = Context.getBean(UserRepository.class);
		User user = new User();
		user.setEmail("abc@gmail");
		user.setName("kamal");
		user.setAbout("I am a java developer");
		userRepository.save(user);*/
	}
}