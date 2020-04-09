package com.app.registration.repo;

import java.util.List;
import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.app.registration.model.AllCustomersData;

public interface DummyRepo extends JpaRepository<AllCustomersData,Long> {
	//AllCustomersData findByCifCode();
	List<AllCustomersData>findByCifCode();
}
