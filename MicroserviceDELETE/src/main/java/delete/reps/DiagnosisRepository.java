package delete.reps;

import org.springframework.data.jpa.repository.JpaRepository;

import delete.jpa.Diagnosis;

public interface DiagnosisRepository extends JpaRepository <Diagnosis, Integer> {

}
