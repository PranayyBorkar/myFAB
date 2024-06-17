package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Records;
import com.example.demo.reopository.RecordRepo;

@Service
public class RecordServiceImpl implements RecordService {
	
	@Autowired
	RecordRepo RecR;

	@Override
	public void saveRecord(Records Recorddetails) throws Exception {
		// TODO Auto-generated method stub
		Records urecord = new Records();
		
		urecord.setId(Recorddetails.getId());
		urecord.setBalance(Recorddetails.getBalance());
		urecord.setUsername(Recorddetails.getUsername());
		urecord.setBarcode(Recorddetails.getBarcode());
		urecord.setNxt_draw(Recorddetails.getNxt_draw());
		urecord.setRecord_date(Recorddetails.getRecord_date());
		urecord.setTck_quantity(Recorddetails.getTck_quantity());
		urecord.setTck_result(Recorddetails.getTck_result());
		urecord.setTck_time(Recorddetails.getTck_time());
		urecord.setWin_amt(Recorddetails.getWin_amt());
		urecord.setWin_qty(Recorddetails.getWin_qty());
		urecord.setWin_result(Recorddetails.getWin_result());
		
		RecR.save(urecord);
		
	}

}
