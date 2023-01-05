package com.vexusapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vexusapp.entities.Billing;

public interface BillRepository extends JpaRepository<Billing, Long> {
	
}
