package edu.ait.hospitalmanagement.controllers;

import edu.ait.hospitalmanagement.dto.Patient;
import edu.ait.hospitalmanagement.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;

@RestController
public class loginController {

    @Autowired
    PatientRepository patientRepository;

    @PostMapping("patient/")
    public ResponseEntity createPatient(@RequestBody Patient newPatient) {
        //add the patient
        Patient patient = patientRepository.save(newPatient);

        //create the location header
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest().path("{id}")
                .buildAndExpand(patient.getId()).toUri();
        return ResponseEntity.created(location).build();
    }


}
