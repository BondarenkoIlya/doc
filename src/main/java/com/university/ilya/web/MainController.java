package com.university.ilya.web;

import com.university.ilya.service.impl.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.Map;

@Controller
public class MainController {

    private UserService userService;

    @Autowired
    public MainController(UserService userService) {
        this.userService = userService;
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index(Map<String, Object> model) {
        model.put("hello", "Hello from mvc");
        return "index";
    }

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello(Map<String, Object> model) {
        model.put("user", userService.getUserByName("Ilya"));
        return "index";
    }
}
