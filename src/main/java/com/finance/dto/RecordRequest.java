package com.finance.dto;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

public class RecordRequest {
	@NotNull
	private Double amount;
	
	@NotBlank
	private String type;
	
	@NotBlank
	private String category;
	
	private String description;

}
