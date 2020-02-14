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
		User user = (User) obj;
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "NotEmpty");
		if(user.getUsername()().length()< 16 || user.getUsername()().length()> 32) {
			errors.rejectValue("username", "Size.userForm.username");
		}
		
		if(userService.findByUsername(user.getUsername()!=null){
			errors.rejectValue("username", "Duplicate.userForm.username");
		}
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty");
		if(user.getPassword().length() < 8 || user.getPassword().length() > 32) {
			errors.rejectValue("email", "Size.userForm.password");
		}
		
		if(!user.getConfirmpassword().equals(user.getPassword())) {
			errors.rejectValue("confirmpassword", "Diff.userForm.confirmpassword");
		}
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "pan", "NotEmpty");
		if(user.getPan().length() != 16) {
			errors.rejectValue("pan","Size.userForm.pan");
		}
		
		
		
	}

}
