package com.yuan.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.yuan.pojo.User;
import com.yuan.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/user/findAll")
    public String findAll() throws JsonProcessingException {
        ObjectMapper objectMapper = new ObjectMapper();
        List<User> all = userService.findAll();
        return objectMapper.writeValueAsString(all);

    }
}
