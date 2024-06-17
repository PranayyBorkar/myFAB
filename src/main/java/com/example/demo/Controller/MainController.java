package com.example.demo.Controller;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.model.Records;
import com.example.demo.model.Users;
import com.example.demo.service.FunService;
import com.example.demo.service.RecordService;

@RestController
public class MainController {

	@Autowired
	FunService FSev;
	
	@Autowired
	RecordService Rser;
	
	//http://localhost:8080/Usedetails/SaveUserDetails
	@PostMapping("/Usedetails/SaveUserDetails")
	public String SaveUsersDetails(@RequestBody Users Usedetails) {
		
		
		try {
			FSev.saveFun(Usedetails);
			return"Sucess";
		}catch(Exception e) {
			e.printStackTrace(); // Log the exception for debugging
			return "Failure"+ e.getMessage();
		}
		
	}
	
	//http://localhost:8080/recordtable
		@PostMapping("/recordtable")
		public String SaveRecord(@RequestBody Records Recorddetails) {
			
			
			try {
				Rser.saveRecord(Recorddetails);
				return"Sucess";
			}catch(Exception e) {
				e.printStackTrace(); // Log the exception for debugging
				return "Failure"+ e.getMessage();
			}
			
		}
		
		// http://localhost:8080/Usedetails/UpdateBalance
	    @PostMapping("/Usedetails/UpdateBalance")
	    public String updateBalance(@RequestBody Users userBalance) {
	        try {
	            FSev.updateBalance(userBalance.getUsername(), userBalance.getBalance());
	            return "Success";
	        } catch (Exception e) {
	            e.printStackTrace(); // Log the exception for debugging
	            return "Failure: " + e.getMessage();
	        }
	    }
	
	//http://localhost:8080/Usedetails/GetBalance
	 @GetMapping("/Usedetails/GetBalance/{username}")
	    public float getBalance(@PathVariable("username") String username) {
	        try {
	            return FSev.getBalance(username);
	        } catch (Exception e) {
	            e.printStackTrace(); // Log the exception for debugging
	            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "User not found", e);
	        }
	    }
}
