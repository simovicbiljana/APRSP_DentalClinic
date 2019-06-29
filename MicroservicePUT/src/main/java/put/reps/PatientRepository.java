package put.reps;

import org.springframework.data.jpa.repository.JpaRepository;

import put.jpa.Patient;

public interface PatientRepository extends JpaRepository <Patient, Integer>{

}
