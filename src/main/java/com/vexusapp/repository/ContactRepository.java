package com.vexusapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vexusapp.entities.Contact;

public interface ContactRepository extends JpaRepository<Contact, Long> {

}
