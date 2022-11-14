package com.maple.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

@RestController
public class UserController {
    @Autowired
 
    @RequestMapping(value="/user",produces = "text/html;charset=UTF-8")
    public String index() {
		System.out.println("UserController.index");
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }
}