package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Users;
import com.example.demo.reopository.FunRepo;

@Service
public  class FunServiceImpl implements FunService {
	
	@Autowired
	FunRepo FR;
	

	@Override
	public void saveFun(Users UserDetails) throws Exception{
		// TODO Auto-generated method stub
		Users uService =new Users();
		
		 // Check if username already exists
        if (FR.findByUsername(UserDetails.getUsername()) != null) {
            throw new Exception("Username already exists");
        }else {
        
		uService.setId(UserDetails.getId());
		uService.setBalance(UserDetails.getBalance());
		uService.setUsername(UserDetails.getUsername());
		uService.setPassword(UserDetails.getPassword());
		uService.setName(UserDetails.getName());
		uService.setStatus(UserDetails.getStatus());
		
		FR.save(uService);
        }
	}


	@Override
	public float getBalance(String username) {
		// TODO Auto-generated method stub
		 Users user = FR.findByUsername(username); // Find user by 
	        if (user != null) {
	            return user.getBalance();
	        } else {
	            throw new RuntimeException("User not found");
	        }
	}


	@Override
	public void updateBalance(String username, float balance) throws Exception {
		// TODO Auto-generated method stub
		
		Users user = FR.findByUsername(username);
        if (user != null) {
            user.setBalance(balance);
            FR.save(user);
        } else {
            throw new RuntimeException("User not found");
        }
	}


	


	
	
 
	
}
