package com.example.demo.service;

import java.util.List;

import org.springframework.stereotype.Service;


import com.example.demo.model.Result;

@Service
public interface ResultService {

	public void saveResult(Result Resultdetails) throws Exception;
	
	List<Result> getAllResults();
	
	 List<String> getLastFiveMinutesResults();
	 
	 String  getLatestResult();
}
