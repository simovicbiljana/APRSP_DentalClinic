package get.reps;

import org.springframework.data.jpa.repository.JpaRepository;

import get.jpa.Diagnosis;

public interface DiagnosisRepository extends JpaRepository<Diagnosis, Integer>{

}
