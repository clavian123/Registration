package com.app.service;

import java.util.List;

import com.app.model.User;

public interface UserService {
	List<User> findAlluser();
	User findById(User user);
	User findByPan(String pan);
	void updatePassword(User user);
	void save(User user);
	
}
