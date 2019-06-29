package get.reps;

import org.springframework.data.jpa.repository.JpaRepository;

import get.jpa.Tooth;

public interface ToothRepository extends JpaRepository <Tooth, Integer>{

}
