package com.yuan.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yuan.pojo.User;
import com.yuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
public class UserController {
    @Autowired
    UserService userService;

    @RequestMapping("/hello")
    public String hello(Model model) {
        model.addAttribute("msg","helloSSM");
        return "hello";
    }

    @RequestMapping("/user/findAll")
    @ResponseBody
    public String findAll() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<User> all = userService.findAll();
        return objectMapper.writeValueAsString(all);
    }
}
