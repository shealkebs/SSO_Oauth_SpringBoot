package com.sso.oauth.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sso.oauth.app.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{

}
