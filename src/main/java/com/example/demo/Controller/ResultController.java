package com.example.demo.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.example.demo.model.Result;

import com.example.demo.service.ResultService;

@RestController
public class ResultController {

	@Autowired
	ResultService ResSer;
	
	//http://localhost:8080/Resultdetails
		@PostMapping("/Resultdetails")
		public String SaveResultDetails(@RequestBody Result Resultdetails) {
			
			
			try {
				ResSer.saveResult(Resultdetails);
				return"Sucess";
			}catch(Exception e) {
				e.printStackTrace(); // Log the exception for debugging
				return "Failure"+ e.getMessage();
			}
			
		}
		
		
		//http://localhost:8080/getResult
		 @GetMapping("/getResult")
		 public List<Result> getAllResults() {
		        try {
		            return ResSer.getAllResults();
		        } catch (Exception e) {
		            e.printStackTrace(); // Log the exception for debugging
		            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Results not found", e);
		        }
		    }
		 
		 // http://localhost:8080/getLastFiveMinutesResults
		    @GetMapping("/getLastFiveMinutesResults")
		    public  List<String> getLastFiveMinutesResults() {
		        try {
		            return ResSer.getLastFiveMinutesResults();
		        } catch (Exception e) {
		            e.printStackTrace(); // Log the exception for debugging
		            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Results not found", e);
		        }
		    }
		    
		    @GetMapping("/getLatestResult")
		    public String getLatestResult() {
		        try {
		            return ResSer.getLatestResult();
		        } catch (Exception e) {
		            e.printStackTrace(); // Log the exception for debugging
		            throw new ResponseStatusException(HttpStatus.NOT_FOUND, "Result not found", e);
		        }
		    }
		    
}
