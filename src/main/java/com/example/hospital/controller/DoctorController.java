package com.example.hospital.controller;

import com.example.hospital.controller.request.DoctorCreationRequest;
import com.example.hospital.controller.response.DoctorReturnResponse;
import com.example.hospital.model.Doctor;
import com.example.hospital.service.DoctorService;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@Validated
public class DoctorController {

    private final DoctorService doctorService;

    public DoctorController(DoctorService doctorService) {

        this.doctorService = doctorService;
    }

    @GetMapping(value = ("doctor/{id}"))
    public DoctorReturnResponse getDoctorbyId(@PathVariable(value = "id") Long id) {
        Doctor doctor = doctorService.findById(id);
        return new DoctorReturnResponse(doctor.getId(), doctor.getName(), doctor.getSpecialty());
    }

    @GetMapping(value = "doctors/{id}")
    public List<DoctorReturnResponse> getAllDoctors(@PathVariable(value = "id") Long id) {
        List<Doctor> doctorList = doctorService.findAll();
        List<DoctorReturnResponse> doctorReturnResponseList = new ArrayList<>();
        for (Doctor doctor : doctorList) {
            doctorReturnResponseList.add(new DoctorReturnResponse(
                    doctor.getId(),
                    doctor.getName(),
                    doctor.getSpecialty()));
        }
        return doctorReturnResponseList;

    }
    @DeleteMapping("/doctor")
    public void deleteById(@PathVariable(value = "id") Long id) {
        doctorService.deleteById(id);
    }
    @PostMapping("/doctor")
    public DoctorReturnResponse addPet(@RequestBody DoctorCreationRequest doctorRequest){
        Doctor doctor = doctorService.addPet(Doctor.builder()
                .name(doctorRequest.getName())
                .specialty(doctorRequest.getSpecialty())
                .build()
        );
        return new DoctorReturnResponse(doctor.getId(), doctor.getName(), doctor.getSpecialty());
    }

    @PutMapping(value = "/doctor/{id}")
    public DoctorReturnResponse updateDoctor(@PathVariable(value = "id") Long id, @RequestBody DoctorCreationRequest doctorReq) {
        Doctor doctor = doctorService.update(doctorReq, id);
        DoctorReturnResponse doctorRespReq = new DoctorReturnResponse(
                doctor.getId(),
                doctor.getName(),
                doctor.getSpecialty());
        return doctorRespReq;
    }
}


