package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Users;

@Service
public interface FunService {

	public void saveFun(Users UserDetails) throws Exception;
	
	
	
	public float getBalance(String username);
	
	void updateBalance(String username, float balance) throws Exception;
}
