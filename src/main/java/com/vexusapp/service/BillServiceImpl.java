package com.vexusapp.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vexusapp.entities.Billing;
import com.vexusapp.repository.BillRepository;

@Service
public class BillServiceImpl implements BillService {

	@Autowired
	private BillRepository billRepo;
	
	@Override
	public void saveBill(Billing billing) {
		billRepo.save(billing);
	}

	@Override
	public List<Billing> getAllBills() {
		List<Billing> bills = billRepo.findAll();
		return bills;
	}
	
}
