package com.controller;

import com.bean.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Desciption
 * Create By  li.bo
 * CreateTime 2017/7/22 13:24
 * UpdateTime 2017/7/22 13:24
 */
@RestController
@RequestMapping("/springboot")
public class HelloWorldController {

    @Autowired
    private User user;

    @RequestMapping(value = "/{name}", method = RequestMethod.GET)
    public String sayWorld(@PathVariable("name") String name) {
        return "Hello " + name;
    }

    @RequestMapping(value = "/user/{name}", method = RequestMethod.GET)
    public String sayName(@PathVariable("name") String name){
        System.out.println("userName: " + user.getName() + " " + user.getAge());
        System.out.println(user.getAddress());
        System.out.println(user.getDetailAddress());
        return "Hello " + name;
    }
}