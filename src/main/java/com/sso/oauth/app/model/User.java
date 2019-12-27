package com.sso.oauth.app.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.validation.constraints.NotEmpty;

@Entity
@Table(name = "UserProfile")
public class User {

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	@NotEmpty
    @Column(nullable = false)
    private String username;
    @NotEmpty
    @Column(nullable = false)
    private String firstName;  
    private String LastName;     
    private String role;
    private long mobile;
    private String userMail;
    @Transient
    private int statusCode;
    
    
	public User() {
		super();
	}


	public User(Integer id, @NotEmpty String username, @NotEmpty String firstName, String lastName, String role,
			long mobile, String userMail, int statusCode) {
		super();
		this.id = id;
		this.username = username;
		this.firstName = firstName;
		LastName = lastName;
		this.role = role;
		this.mobile = mobile;
		this.userMail = userMail;
		this.statusCode = statusCode;
	}


	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return LastName;
	}


	public void setLastName(String lastName) {
		LastName = lastName;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}


	public long getMobile() {
		return mobile;
	}


	public void setMobile(long mobile) {
		this.mobile = mobile;
	}


	public String getUserMail() {
		return userMail;
	}


	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}


	public int getStatusCode() {
		return statusCode;
	}


	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}


	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", firstName=" + firstName + ", LastName=" + LastName
				+ ", role=" + role + ", mobile=" + mobile + ", userMail=" + userMail + ", statusCode=" + statusCode
				+ "]";
	}
    
    
}
