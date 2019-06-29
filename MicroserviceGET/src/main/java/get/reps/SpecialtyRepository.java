package get.reps;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import get.jpa.Specialty;

public interface SpecialtyRepository extends JpaRepository <Specialty, Integer>{
	Collection <Specialty> findByAcademictitleContainingIgnoreCase (String academictitle);

}
