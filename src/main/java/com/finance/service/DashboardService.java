package com.finance.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.finance.repository.RecordRepository;

@Service
public class DashboardService {
	@Autowired
	private RecordRepository repo;
	
	public Double totalIncome() {
		return repo.findAll()
				.stream()
				.filter(r->r.getType().equals("INCOME"))
				.mapToDouble(r->r.getAmount())
				.sum();
	}
	public Double totalExpense() {
		return repo.findAll()
				.stream()
				.filter(r->r.getType().equals("Expense"))
				.mapToDouble(r->r.getAmount())
				.sum();
	}
	public Double netBalance() {
		return totalIncome()-totalExpense();
	}
	

}
