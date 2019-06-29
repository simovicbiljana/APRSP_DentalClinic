package post.reps;

import org.springframework.data.jpa.repository.JpaRepository;

import post.jpa.Patient;

public interface PatientRepository extends JpaRepository <Patient, Integer>{

}
