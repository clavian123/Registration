package com.app.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.app.model.User;
import com.app.service.UserService;

public class UserValidator implements Validator {
	@Autowired
	private UserService userService;
		

	@Override
	public boolean supports(Class<?> usclazz) {
		// TODO Auto-generated method stub
		return User.class.equals(usclazz);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		// TODO Auto-generated method stub
		
		
		
	}

}
