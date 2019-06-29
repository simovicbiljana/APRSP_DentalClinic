package get.reps;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;

import get.jpa.Material;

public interface MaterialRepository extends JpaRepository <Material, Integer>{
	Collection<Material> findByNameofmaterialContainingIgnoreCase (String nameodmaterial);

}
