package com.controller;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {
	
	@RequestMapping("loginUser")
	public String login() {
		Logger logger = Logger.getLogger(UserController.class);
		logger.debug("执行login()方法....loginUser.html");
		return "success";
	}
}
