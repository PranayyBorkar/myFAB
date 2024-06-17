package com.example.demo.reopository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Users;

@Repository
public interface FunRepo extends JpaRepository<Users,Integer> {

	Users findByUsername(String username);
	

}


