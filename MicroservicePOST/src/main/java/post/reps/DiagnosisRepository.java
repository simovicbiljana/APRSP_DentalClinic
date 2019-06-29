package post.reps;

import org.springframework.data.jpa.repository.JpaRepository;

import post.jpa.Diagnosis;

public interface DiagnosisRepository extends JpaRepository <Diagnosis, Integer> {

}
