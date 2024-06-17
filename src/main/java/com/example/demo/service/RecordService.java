package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.model.Records;

@Service
public interface RecordService {

	public void saveRecord(Records Recorddetails) throws Exception;
}
