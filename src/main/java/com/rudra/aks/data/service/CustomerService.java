package com.rudra.aks.data.service;

import java.util.List;
import java.util.Map;

import com.rudra.aks.data.bo.CustomerBO;

public interface CustomerService {

	int saveCustomer(CustomerBO customer);
	
	int deleteRecordBy(String tableName, String colName, int value);
	
	int getTotalRowCount(String tableName);

	//given, need to be reviewed as table name is not required
	List<Map<String, Object>> getAllRecord(String tableName);
	
	//proposed, with proper return according to entity
	List<CustomerBO>	getAllRecordNew();
	
	
	//given, need to be reviewed as table name, colName is not required
	List<Map<String, Object>> getRecord(String tableName, String colName, int value);
	
	//proposed, with proper return according to entity
	CustomerBO	getRecordNew(int value);
	
	
	
}
