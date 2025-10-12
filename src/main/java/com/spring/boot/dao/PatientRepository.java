package com.spring.boot.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.spring.boot.entity.Patient;

public interface PatientRepository extends JpaRepository<Patient, Integer> {

}
