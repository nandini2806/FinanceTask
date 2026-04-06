package com.finance.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.finance.service.DashboardService;

@RestController
@RequestMapping("/dashboard")
public class DashboardController {
	@Autowired
	private DashboardService service;
	
	@GetMapping("/income")
	public Double income() {
		return service.totalIncome();
	}
	
	@GetMapping("/expense")
	public Double expense() {
		return service.totalExpense();
	}
	
	@GetMapping("/balance")
	public Double balance() {
		return service.netBalance();
	}
}
