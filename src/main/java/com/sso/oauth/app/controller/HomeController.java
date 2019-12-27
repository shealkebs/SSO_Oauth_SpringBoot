package com.sso.oauth.app.controller;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;
import com.sso.oauth.app.model.User;
import com.sso.oauth.app.service.ProfileService;

@RestController
public class HomeController {
	
	@Autowired
	public ProfileService profileService;
	
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
	
	@GetMapping("/signup")
	public ModelAndView signup( ) {
		System.out.println(" Redirect to....updateProfileUser");
		return new ModelAndView("profile") ;
	}
	
	@PostMapping(value = "/updateProfile")
	public ModelAndView UpdateUserProfile(@ModelAttribute("user") User user,Principal principal) {
		System.out.println("Hii in to update profile");
		System.out.println(principal.getName());
		user.setUsername(principal.getName());
		user = profileService.updateUserProfile(user);
		if(user.getStatusCode() ==200) {
		return new ModelAndView("updateSuccess");
		}
		return new ModelAndView("profile");
	}
	
}
