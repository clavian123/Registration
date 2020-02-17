package com.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.app.model.User;
import com.app.repository.UserRepository;

@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public void save(User user) {
		user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
		userRepository.save(user);
		
	}

	@Override
	public User findByUsername(String username) {
		return userRepository.findByUserName(username);
	}

	@Override
	public User findByPan(String pan) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User findByPin(String pin) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
