package com.finance.repository;

import java.time.LocalDate;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.finance.entity.FinancialRecord;

@Repository
public interface RecordRepository extends JpaRepository<FinancialRecord, Long> {
	List<FinancialRecord> findByCategory(String category);
	
	List<FinancialRecord> findByType(String type);
	
	List<FinancialRecord> findByDateBetween(LocalDate start,LocalDate end);
	
	

}
