package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.springmvc.entity.User;

@Controller 
public class XMLController {
	
	@RequestMapping(value="index")
	public String index(){
		return "xml";
	}
	@RequestMapping(value="xml")
	public @ResponseBody User xml(@RequestBody User user){
		System.out.println(user);
		return user;
	}
}

