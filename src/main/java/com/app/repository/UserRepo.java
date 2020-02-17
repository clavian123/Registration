package com.app.repository;

import java.util.List;

import com.app.model.User;

public interface UserRepo {
	List<User> findAlluser();
	User findById(User user);
	User findByPan(String pan);
	void updatePassword(User user);
	void save(User user);
	
}
