package com.practice.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class Usercontroller {
    @RequestMapping("/index")
    public String Dashboard(){
        return "user_dashboard";
    }

}
