package com.example.hospital.service;

import com.example.hospital.controller.request.PatientCreationRequest;
import com.example.hospital.model.Doctor;
import com.example.hospital.model.Patient;
import com.example.hospital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PatientService {
    private final PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public void deleteById(Long id) {
        patientRepository.deleteById(id);
    }
}
