package edu.ait.hospitalmanagement.controllers;

import edu.ait.hospitalmanagement.dto.HospitalUser;
import edu.ait.hospitalmanagement.dto.Patient;
import edu.ait.hospitalmanagement.repositories.HospitalUserRepository;
import edu.ait.hospitalmanagement.repositories.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;
import java.util.Optional;

@RestController
public class loginController {

    @Autowired
    PatientRepository patientRepository;

    @Autowired
    HospitalUserRepository hospitalUserRepository;

    @PostMapping("patient/")
    public ResponseEntity createPatient(@RequestBody Patient newPatient) {
        //add the patient
        Patient patient = patientRepository.save(newPatient);

        //create the location header
        URI location = ServletUriComponentsBuilder
                .fromCurrentRequest().path("{id}")
                .buildAndExpand(patient.getEmergencyId()).toUri();
        return ResponseEntity.created(location).build();
    }

//    @GetMapping("wines")
//    public Page<HospitalUser> getAllWines(Pageable pageable) {
//        return hospitalUserRepository.findAll();
//    }

}
