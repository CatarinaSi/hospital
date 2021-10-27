package com.example.hospital.model;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Treatment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String patientname;
    private String process;

    @ManyToMany
    @JoinTable(name = "treatment_patient",
            joinColumns = @JoinColumn(name = "treatmentId"),
            inverseJoinColumns = @JoinColumn(name = "patientId"))
    private List<Patient> treatment_patient;
}
