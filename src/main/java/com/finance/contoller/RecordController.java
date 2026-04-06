package com.finance.contoller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.finance.entity.FinancialRecord;
import com.finance.service.RecordService;

@RestController
@RequestMapping("/records")
public class RecordController {
	@Autowired
	private RecordService service;
	
	@PostMapping("/add")
	public FinancialRecord create(@RequestBody FinancialRecord record) {
		return service.createRecord(record);
	}
	
	@GetMapping("/getAll")
	public List<FinancialRecord> getAll(){
		return service.getRecords();
	}
	
	@PutMapping("/{id}")
	public FinancialRecord update(@PathVariable Long id,
			@RequestBody FinancialRecord record ) {
		return service.updateRecord(id, record);
		
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		service.deleteRecord(id);
	}

}
