package com.example.hospital.model;

import lombok.*;
import org.hibernate.validator.constraints.Length;

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
    @Length(min = 10, max = 100)
    private String process;

    @ManyToMany(mappedBy = "patient_treatment")
    private List<Patient> patients;
}
