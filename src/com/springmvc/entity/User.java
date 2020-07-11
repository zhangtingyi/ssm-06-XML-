package com.springmvc.entity;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class User {
	private Integer id;
	private String username;
	private String password;
	public User() {
		super();
	}
	public Integer getId() {
		return id;
	}
	@XmlElement
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	@XmlElement
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	@XmlElement
	public void setPassword(String password) {
		this.password = password;
	}
	public User(Integer id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", password=" + password + "]";
	}
    
}
