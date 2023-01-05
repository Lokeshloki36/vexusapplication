package com.vexusapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vexusapp.entities.Lead;

public interface LeadRepository extends JpaRepository<Lead, Long> {

}
