package com.spring.boot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.spring.boot.entity.Patient;
import com.spring.boot.service.PatientService;

@RestController
public class PatientController {

	@Autowired
	private PatientService patientService;
	
	@PostMapping(value = "/savePatient")
	public Patient saveUser(@RequestBody Patient patient) {
		return patientService.savePatient(patient);
	}

	@GetMapping(value = "/getPatientById/{id}")
	public Patient getPatientById(@PathVariable(value = "id") int id) {
		 return patientService.getPatient(id);
	}

	@GetMapping(value = "/getAllPatients")
	public List<Patient> getAllAvailablePatient() {
		return patientService.getAllPatient();
	}
}
