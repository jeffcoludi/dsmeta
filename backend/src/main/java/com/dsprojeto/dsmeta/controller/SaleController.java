package com.dsprojeto.dsmeta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dsprojeto.dsmeta.entities.Sale;
import com.dsprojeto.dsmeta.services.SaleSevice;

@RestController
@RequestMapping (value ="/sales")
public class SaleController {
	
	
	@Autowired
	private SaleSevice service;
	
	@GetMapping
	public List<Sale> findSales(){
		return service.findSales();
		
		
	}
}
