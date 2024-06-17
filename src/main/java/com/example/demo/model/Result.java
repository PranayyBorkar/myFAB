package com.example.demo.model;

import java.time.LocalDate;
import java.time.LocalTime;




import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Result {

	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	
    public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public String getResult() {
		return result;
	}

	public void setResult(String result) {
		this.result = result;
	}

	 
	LocalDate date;
	
	

	
	LocalTime  time;
	
	String result;
}
