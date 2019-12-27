package com.sso.oauth.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sso.oauth.app.model.User;
import com.sso.oauth.app.repository.UserRepository;
@Service
public class ProfileService {

	@Autowired
	public UserRepository userRepository;
	

	public User updateUserProfile(User user) {
		User u1=userRepository.save(user);
		if(u1!=null) {
			u1.setStatusCode(400);
		}
		u1.setStatusCode(200);
		return u1;
	}

}
