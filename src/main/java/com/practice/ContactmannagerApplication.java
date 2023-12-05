package com.practice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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