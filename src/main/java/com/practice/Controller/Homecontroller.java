package com.practice.Controller;
import com.practice.Entity.User;
import com.practice.dao.UserRepository;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class Homecontroller {
    @Autowired
private UserRepository userRepository;
@RequestMapping("/")
public String Home(Model model){
    model.addAttribute("title","Home-Smart Contact Manager");
    return "home";
}
    @RequestMapping("/about")
    public String About(Model model){
        model.addAttribute("title","About-Smart Contact Manager");
        return "about";
    }
    @RequestMapping("/signup")
    public String Signup(Model model){
        model.addAttribute("title","Signup-Smart Contact Manager");
        model.addAttribute("user","new User()");
        return "signup";
    }
    // Handler for registering user
    @RequestMapping(value = "/do_register",method = RequestMethod.POST)
    public String registeruser(@Valid @ModelAttribute("user") User user, BindingResult result1, @RequestParam(value = "agreement", defaultValue = "false") boolean agreement, Model model){

    if(result1.hasErrors()){
        System.out.println(result1);
    model.addAttribute("user",user);
    return "signup";
    }
    //System.out.println("Agreement"+agreement);
    //System.out.println("User"+user);
    user.setRole("normal_user");
    user.setImageUrl("image");
    user.setEnable(true);
    User result= this.userRepository.save(user);
    model.addAttribute("user",result);
    return "signup";
    }
    }


