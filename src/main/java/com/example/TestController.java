package com.example;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by liuyijie on 2017/6/15.
 */
@Controller
public class TestController {

    /**
     */
    @RequestMapping(value = "login",  method = RequestMethod.GET)
    public String login(){
        return "login";
    }

    /**
     */
    @RequestMapping(value = "login",  method = RequestMethod.POST)
    public String loginProcess(@RequestParam String username, @RequestParam String password,
            Model model){
        model.addAttribute("username", username);
        model.addAttribute("password", password);
        System.out.println(ToStringBuilder.reflectionToString(password));
        return "index";
    }


}
