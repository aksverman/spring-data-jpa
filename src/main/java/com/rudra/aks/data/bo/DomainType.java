package com.rudra.aks.data.bo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//@Entity
public class DomainType {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
}
