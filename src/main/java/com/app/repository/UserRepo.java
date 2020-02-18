package com.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.model.User;

public interface UserRepo extends JpaRepository<User, Long> {
	@Query("select * from User ")
	List<User> findAlluser();
	
	@Query("Select o.id from User o where o.id where o.id = user.id ")
	User findById(User user);
	
	@Query("Select o.pan from User where o.pan = panParam")
	User findByPan(String pan);
	
	void updatePassword(User user);
	void saves(User user);
	
}
