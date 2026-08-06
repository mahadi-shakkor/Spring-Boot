package com.easybytes.jobportal.repository;

import com.easybytes.jobportal.entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}