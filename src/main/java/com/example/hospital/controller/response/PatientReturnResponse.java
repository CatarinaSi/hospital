package com.example.hospital.controller.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class PatientReturnResponse {
    private Long id;
    private String name;
    private int age;
    private String disease;
}

