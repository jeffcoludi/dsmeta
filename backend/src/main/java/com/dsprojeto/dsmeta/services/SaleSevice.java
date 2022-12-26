package com.dsprojeto.dsmeta.services;
 import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dsprojeto.dsmeta.entities.Sale;
import com.dsprojeto.dsmeta.repositories.SaleRepository;

@Service
public class SaleSevice {

	@Autowired
	private SaleRepository repository;
	
		public List<Sale> findSales() {
			return repository.findAll();
			
		}
		
	}
	
	

