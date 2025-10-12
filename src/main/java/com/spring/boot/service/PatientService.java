package com.spring.boot.service;

import java.util.List;

import com.spring.boot.entity.Patient;

public interface PatientService {

	public Patient savePatient(Patient p);
	
	public Patient getPatient(int id);
	
	public List<Patient> getAllPatient();
	
}
