package com.example.hospital.exception;

public class DoctorNotFound extends RuntimeException {
    public DoctorNotFound() {

        super("Oops, Doctor not found");
    }

    public DoctorNotFound(String message) {
        super(message);
    }
}
