package get.reps;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import get.jpa.Workplace;

public interface WorkplaceRepository extends JpaRepository <Workplace, Integer>{
	Collection <Workplace> findByNameofworkplaceContainingIgnoreCase (String nameofworkplace);

}
