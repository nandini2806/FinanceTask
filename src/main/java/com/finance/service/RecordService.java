package com.finance.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finance.entity.FinancialRecord;
import com.finance.entity.User;
import com.finance.repository.RecordRepository;

@Service
public class RecordService {
	@Autowired
	private RecordRepository repo;
	
	public FinancialRecord createRecord(FinancialRecord record) {
		return repo.save(record);
	}
	
	public List<FinancialRecord> getRecords(){
		return repo.findAll();
	}
	
	public FinancialRecord updateRecord(Long id,FinancialRecord record) {
		 FinancialRecord existing=repo.findById(id)
				.orElseThrow(()->new RuntimeException("Record not found"));
		existing.setAmount(record.getAmount());
		existing.setCategory(record.getCategory());
		existing.setType(record.getType());
		return repo.save(existing);	
	}

	public void deleteRecord(Long id) {
		repo.deleteById(id);
	}
}
