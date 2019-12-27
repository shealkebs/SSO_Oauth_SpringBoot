package com.sso.oauth.app.controller;

import java.security.Principal;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;


@RestController
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	ModelAndView model = new ModelAndView();
	
	@RequestMapping(value = {"/"}, method = RequestMethod.GET)
	public ModelAndView home() {
		logger.info("In  home Controller");
		model.setViewName("home");
		return model;
	}

	@GetMapping("/user")
	public Principal user(Principal principal) {
		logger.info("In User Controller");
		logger.info(principal.getName()+"...."+principal.toString());
		return principal;
	}
	
	
	
}
