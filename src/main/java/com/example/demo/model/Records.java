package com.example.demo.model;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Records {

	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	Integer id;
	
	float nxt_draw;
	float balance;
	String username;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public float getNxt_draw() {
		return nxt_draw;
	}
	public void setNxt_draw(float nxt_draw) {
		this.nxt_draw = nxt_draw;
	}
	public float getBalance() {
		return balance;
	}
	public void setBalance(float balance) {
		this.balance = balance;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public float getTck_result() {
		return tck_result;
	}
	public void setTck_result(float tck_result) {
		this.tck_result = tck_result;
	}
	public float getTck_quantity() {
		return tck_quantity;
	}
	public void setTck_quantity(float tck_quantity) {
		this.tck_quantity = tck_quantity;
	}
	public float getWin_qty() {
		return win_qty;
	}
	public void setWin_qty(float win_qty) {
		this.win_qty = win_qty;
	}
	public float getWin_result() {
		return win_result;
	}
	public void setWin_result(float win_result) {
		this.win_result = win_result;
	}
	public float getWin_amt() {
		return win_amt;
	}
	public void setWin_amt(float win_amt) {
		this.win_amt = win_amt;
	}
	public LocalDate getRecord_date() {
		return record_date;
	}
	public void setRecord_date(LocalDate record_date) {
		this.record_date = record_date;
	}
	public LocalTime getTck_time() {
		return tck_time;
	}
	public void setTck_time(LocalTime tck_time) {
		this.tck_time = tck_time;
	}
	public float getBarcode() {
		return barcode;
	}
	public void setBarcode(float barcode) {
		this.barcode = barcode;
	}
	float tck_result;
	float tck_quantity;
	float win_qty;
	float win_result;
	float win_amt;
	LocalDate record_date;
	
	LocalTime  tck_time;
	float barcode;
	
	 
}
