package com.rudra.aks.data.service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rudra.aks.data.bo.CustomerBO;
import com.rudra.aks.data.repository.CustomerRepository;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Autowired
	CustomerRepository	repo;
	

	private final Logger logger = LoggerFactory.getLogger(CustomerServiceImpl.class);
	
	
	public int saveCustomer(CustomerBO customer) {
		CustomerBO cust = repo.save(customer);
		return cust.getCustomerid();
	}



	public int deleteRecordBy(String tableName, String colName, int value) {
		logger.info("Deleting record by ID: ");
		repo.delete(value);
		return 0;
	}



	public List<Map<String, Object>> getAllRecord(String tableName) {
		List<CustomerBO> all = repo.findAll();
		
		/*
		 * converting to list of map 
		 */
		Map<String, Object>	listMap = new HashMap<String, Object>();
		Iterator<CustomerBO> it = all.iterator();
		
		while(it.hasNext()) {
			CustomerBO next = it.next();
			listMap.put(String.valueOf(next.getCustomerid()), next);
		}
		List<Map<String, Object>> result = new ArrayList<Map<String, Object>>();
		result.add(listMap);
		
		
		return result;
	}



	public int getTotalRowCount(String tableName) {
		return (int) repo.count();
	}



	public List<CustomerBO> getAllRecordNew() {
		return repo.findAll();
	}



	public CustomerBO getRecordNew(int value) {
		return repo.findOne(value);
	}



	public List<Map<String, Object>> getRecord(String tableName, String colName, int value) {
		//not required 
		return null;
	}

	
	
	
}
