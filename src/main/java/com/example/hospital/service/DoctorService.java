package com.example.hospital.service;

import com.example.hospital.controller.request.DoctorCreationRequest;
import com.example.hospital.exception.DoctorNotFound;
import com.example.hospital.model.Doctor;
import com.example.hospital.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DoctorService {
    private final DoctorRepository doctorRepository;

    public DoctorService(DoctorRepository doctorRepository) {
        this.doctorRepository = doctorRepository;
    }

    public Doctor findById(Long id) {
        return doctorRepository.findById(id).orElseThrow(DoctorNotFound::new);
    }

    public List<Doctor> findAll() {
        return doctorRepository.findAll();
    }

    public void deleteById(Long id) {
        doctorRepository.deleteById(id);
    }

    public Doctor update(DoctorCreationRequest doctorReq, Long id) {
        Doctor doctor= this.findById(id);
        doctor.setName(doctorReq.getName());
        doctor.setSpecialty(doctorReq.getSpecialty());
        return doctorRepository.save(doctor);
    }

    public Doctor addPet(Doctor doctor) {
        return doctorRepository.save(doctor);
    }
}
