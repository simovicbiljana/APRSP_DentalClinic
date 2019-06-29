package delete.reps;

import org.springframework.data.jpa.repository.JpaRepository;

import delete.jpa.Patient;

public interface PatientRepository extends JpaRepository <Patient, Integer>{

}
