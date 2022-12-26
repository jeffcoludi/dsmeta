package com.dsprojeto.dsmeta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dsprojeto.dsmeta.entities.Sale;
import com.dsprojeto.dsmeta.services.SaleSevice;

@RestController
@RequestMapping (value ="/sales")
public class SaleController {
	
	
	@Autowired
	private SaleSevice service;
	
	@GetMapping
	public Page<Sale> findSales(
			@RequestParam(value="minDate", defaultValue="")  String minDate, 
			@RequestParam(value="maxDate", defaultValue="") String maxDate,
			Pageable pageable){
		return service.findSales(minDate, maxDate,pageable);
		
		
	}
}
