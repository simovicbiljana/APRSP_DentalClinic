package put.reps;

import org.springframework.data.jpa.repository.JpaRepository;

import put.jpa.Diagnosis;

public interface DiagnosisRepository extends JpaRepository <Diagnosis, Integer> {

}
