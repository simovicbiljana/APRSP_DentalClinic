package get.reps;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import get.jpa.Employed;

public interface EmployedRepository extends JpaRepository <Employed, Integer>{
	Collection<Employed> findByLastnameContainingIgnoreCase (String lastname);

}
