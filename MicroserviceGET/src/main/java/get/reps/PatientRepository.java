package get.reps;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import get.jpa.Patient;

public interface PatientRepository extends JpaRepository <Patient, Integer> {
	Collection <Patient> findByLastnameContainingIgnoreCase (String lastname);

}
