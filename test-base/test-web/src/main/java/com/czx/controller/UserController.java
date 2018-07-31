package com.czx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.czx.dto.User;
import com.czx.service.UserSerevice;

@Controller
public class UserController {

	@Autowired
	private UserSerevice userSerevice;
	
	@RequestMapping("/")
	@ResponseBody
	public User testFind() {
		
		return userSerevice.searchUser();
	}
}
