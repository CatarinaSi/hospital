package com.example.hospital.exception;

public class PatientNotFound extends RuntimeException {
    public PatientNotFound() {
        super("Oops, Patient not found,try again");
    }
    public PatientNotFound(String message) {
        super(message);
    }
}
