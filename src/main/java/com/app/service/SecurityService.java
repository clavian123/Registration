package com.app.service;

public interface SecurityService {
	String findLoggedInUsername();
	String findPan();
	
	void autologin(String username, String password);
	void autloginWithpan(String pan, String username);
}
