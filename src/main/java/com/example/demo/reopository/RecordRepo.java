package com.example.demo.reopository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Records;



@Repository
public interface RecordRepo extends JpaRepository<Records,Integer> {

	
}


