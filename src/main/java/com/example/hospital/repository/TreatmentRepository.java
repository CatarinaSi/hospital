package com.example.hospital.repository;

import com.example.hospital.model.Treatment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TreatmentRepository extends JpaRepository<Treatment,Long> {
}
