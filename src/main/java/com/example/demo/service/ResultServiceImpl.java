package com.example.demo.service;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Result;
import com.example.demo.reopository.ResultRepo;

@Service
public class ResultServiceImpl implements ResultService {

	@Autowired
	ResultRepo ResRepo;
	
	@Override
	public void saveResult(Result Resultdetails) throws Exception {
		// TODO Auto-generated method stub
		Result res = new Result();
		
		res.setId(Resultdetails.getId());
		res.setDate(Resultdetails.getDate());
		res.setTime(Resultdetails.getTime());
		res.setResult(Resultdetails.getResult());
		
		ResRepo.save(res);
	}

	@Override
	public List<Result> getAllResults() {
		// TODO Auto-generated method stub
		 
			return ResRepo.findAll();
		
	}

	@Override
	public List<String> getLastFiveMinutesResults() {
		// TODO Auto-generated method stub
		 // Get current time in UTC
        ZonedDateTime utcNow = ZonedDateTime.now(ZoneId.of("UTC"));

        // Convert to IST
        ZonedDateTime istNow = utcNow.withZoneSameInstant(ZoneId.of("Asia/Kolkata"));

        // Calculate the time 5 minutes ago
        ZonedDateTime istStartTime = istNow.minusMinutes(5);

        // Format the times as strings
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String endTime = istNow.format(formatter);
        String startTime = istStartTime.format(formatter);

        // Call the repository method
        return ResRepo.findLastFiveMinutesResults(startTime, endTime);
	}

	@Override
	public String getLatestResult() {
		// TODO Auto-generated method stub
		  // Get current time in UTC
        ZonedDateTime utcNow = ZonedDateTime.now(ZoneId.of("UTC"));

        // Convert to IST
        ZonedDateTime istNow = utcNow.withZoneSameInstant(ZoneId.of("Asia/Kolkata"));

        // Format the current IST time as a string
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        String currentISTTime = istNow.format(formatter);

        // Call the repository method
        return ResRepo.findLatestResult(currentISTTime);
	}

}
