package com.example.hospital.controller;

import com.example.hospital.controller.request.DoctorCreationRequest;
import com.example.hospital.controller.request.PatientCreationRequest;
import com.example.hospital.controller.response.DoctorReturnResponse;
import com.example.hospital.controller.response.PatientReturnResponse;
import com.example.hospital.model.Doctor;
import com.example.hospital.model.Patient;
import com.example.hospital.service.PatientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class PatientController {

    private final PatientService patientService;

    public PatientController(PatientService patientService) {
        this.patientService = patientService;
    }
    @DeleteMapping("/patient")
    public void deleteById(@PathVariable(value = "id") Long id) {
        patientService.deleteById(id);
    }
}

