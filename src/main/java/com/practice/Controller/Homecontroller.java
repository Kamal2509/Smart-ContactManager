package com.practice.Controller;

import com.practice.Entity.User;
import com.practice.dao.UserRepository;
import com.practice.helper.message;

import io.micrometer.common.util.internal.logging.Slf4JLoggerFactory;
import jakarta.servlet.http.HttpSession;
import jakarta.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class Homecontroller {
	Logger logger = LoggerFactory.getLogger(Homecontroller.class);
	@Autowired
	private UserRepository userRepository;

	@RequestMapping("/")
	public String Home(Model model) {
		model.addAttribute("title", "Home-Smart Contact Manager");
		return "home";
	}

	@RequestMapping("/about")
	public String About(Model model) {
		model.addAttribute("title", "About-Smart Contact Manager");
		return "about";
	}

	@RequestMapping("/signup")
	public String Signup(Model model, HttpSession session) {
		model.addAttribute("title", "Signup-Smart Contact Manager");
		model.addAttribute("user", new User());
		session.removeAttribute("message");
		return "signup";
	}

	// Handler for registering user
	@RequestMapping(value = "/do_register", method = RequestMethod.POST)
	public String registeruser(@Valid @ModelAttribute("user") User user, BindingResult result1,
			@RequestParam(value = "agreement", defaultValue = "false") boolean agreement, Model model,
			HttpSession session) {

		try {
			if (!agreement) {
				throw new Exception("please sect term and conditions");
				}
			
			user.setRole("normal_user");
			user.setImageUrl("image");
			user.setEnable(true);

			User result = this.userRepository.save(user);
			model.addAttribute("user", new User());
			session.setAttribute("message", new message("Signup Successfully !!!", "alert-success"));
			return "signup";
		} catch (Exception e) {
			e.printStackTrace();
			model.addAttribute("user", user);
			session.setAttribute("message", new message("Please Accept terms and conditions !!", "alert-danger"));
			return "signup";
		}

	}

}
