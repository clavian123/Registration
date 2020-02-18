package com.app.controller;

import java.util.List;

import org.hibernate.mapping.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;

import com.app.model.Customer;
import com.app.model.User;
import com.app.repository.UserRepo;
import com.app.service.SecurityService;
import com.app.service.UserService;
import com.app.validator.UserValidator;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value ="dummy_customer")
public class UserController {
	@Autowired
	private UserService userService;
	
	@Autowired
	private SecurityService securityService;
	
	@Autowired
	private UserValidator userValidator;
	
	//@RequestMapping(value = "/registration", method = RequestMethod.POST)
	//bisa map/ doc public String registration(Model model)
//	public Map{
//		model.addAttribute("userForm", new User());
//		
//		return "registration";
//	}
	
//	@RequestMapping(value = "/registration", method = RequestMethod.POST)
//	public String registration
//	(@ModelAttribute("userForm") User userForm,
//			BindingResult bindingResult, 
//			Model model) {
//		userValidator.validate(userForm, bindingResult);
//		
//		if(bindingResult.hasErrors()) {
//			return "registration";
//		}
//		
//		userService.save(userForm);
//		if(userForm.getPan() == null) {
//			securityService.autloginWithpan(userForm.getUsername(), userForm.getConfirmpassword());
//		}
//		//buat add ke repo
//		//User user = user
//		
//		return "redirect:/dashboard";
//		
//		
//		}
//		
//		@RequestMapping(value = {"/","/dashboard"},method =RequestMethod.GET)
//		public String dashboard(Model model2) {
//		return "Welcome to SIMOBI";
//		
//	}
	
	@Autowired
	UserRepo userRepo;
	
	@GetMapping(value="/all")
	public  @ResponseBody  List<User> findAll(){
		
		return userRepo.findAll();
		
	}
}
