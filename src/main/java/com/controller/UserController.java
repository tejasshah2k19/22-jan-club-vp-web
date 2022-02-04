package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.bean.UserBean;

@Controller
public class UserController {

	@RequestMapping(value = "/signup", method = RequestMethod.GET)
	public String signup() {
		return "Signup";// jsp
	}

	@RequestMapping(value = "/saveuser", method = RequestMethod.POST)
	public String saveUser(UserBean user) {

		System.out.println(user.getEmail());
		System.out.println(user.getFirstName());
		// temp->container -->bean

		return "Home";
	}

}
