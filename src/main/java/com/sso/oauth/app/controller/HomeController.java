package com.sso.oauth.app.controller;

import java.security.Principal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class HomeController {
	
	
	@RequestMapping(value = {"/"}, method = RequestMethod.GET)
	public ModelAndView home() {
		System.out.println("In  home Controller");
		return new ModelAndView("home");
	}

	@GetMapping("/user")
	public Principal user(Principal principal) {
		System.out.println("hiii");
		System.out.println(principal.getName()+"...."+principal.toString());
		return principal;
	}
	
	
	
}
