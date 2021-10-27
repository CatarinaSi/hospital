package com.example.hospital.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Patient {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank(message = "Name is mandatory")
    private String name;
    @Min(1)
    private int age;
    private String disease;

    @ManyToOne
    @JoinColumn(name = "id_doctor")
    private Doctor doctor;

    @ManyToMany
    @JoinTable(name = "patient_treatment",
            joinColumns = @JoinColumn(name = "patientId"),
            inverseJoinColumns = @JoinColumn(name = "treatmentId"))
    private List<Treatment> patient_treatment;
}
