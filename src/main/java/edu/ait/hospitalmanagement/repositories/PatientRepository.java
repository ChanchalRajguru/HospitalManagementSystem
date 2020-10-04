package edu.ait.hospitalmanagement.repositories;

import edu.ait.hospitalmanagement.dto.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientRepository extends JpaRepository<Patient,Integer> {

}
