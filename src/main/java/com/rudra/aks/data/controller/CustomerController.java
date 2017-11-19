package com.rudra.aks.data.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.rudra.aks.data.bo.CustomerBO;
import com.rudra.aks.data.service.CustomerService;

@RestController
@RequestMapping("/customer")
public class CustomerController {

	@Autowired
	CustomerService	  customerSerivce;
	
	/**
	 * It is used to save the customer info.
	 * 
	 * @param customerBO
	 * @return  saved customer id.
	 */
	@RequestMapping(path = "/save", method = RequestMethod.POST)
	public int	saveCustomer(@RequestBody CustomerBO customerBO) {
		int customer = customerSerivce.saveCustomer(customerBO);
		if( customer > 0)
			return customer;
		return 0;
	}
	
	
	@GetMapping("/getAllRecord")
	public	List<CustomerBO>	getAllRecord() {
		return customerSerivce.getAllRecordNew();
	}
	
	@GetMapping("/getRecord")
	public CustomerBO	getRecord(@RequestParam("value")int value){
		return customerSerivce.getRecordNew(value);
	}
	
	@RequestMapping(path = "/count")
	public	int	getTotalCount() {
		return customerSerivce.getTotalRowCount("");
	}
	
	@RequestMapping(path = "/delete", method = RequestMethod.DELETE)
	public String delete(@RequestParam("value")int value) {
		customerSerivce.deleteRecordBy("", "", value);
		return "done";
	}
	
}
