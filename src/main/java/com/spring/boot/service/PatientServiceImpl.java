package com.spring.boot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.boot.dao.PatientRepository;
import com.spring.boot.entity.Patient;
import com.spring.boot.exception.PatientNotFoundException;

@Service
public class PatientServiceImpl implements PatientService {

	@Autowired
	private PatientRepository patientRepository;

	
	@Override
	public Patient savePatient(Patient p) {
		return patientRepository.save(p);
	}

	@Override
	public Patient getPatient(int id) {
		return patientRepository.findById(id)
				.orElseThrow(() -> new PatientNotFoundException("this patient is not available.........." + id));
	}

	@Override
	public List<Patient> getAllPatient() {
		return patientRepository.findAll();
	}

}
