package com.vexusapp.service;

import java.util.List;

import com.vexusapp.entities.Billing;

public interface BillService {

	void saveBill(Billing billing);

	List<Billing> getAllBills();
	
}
