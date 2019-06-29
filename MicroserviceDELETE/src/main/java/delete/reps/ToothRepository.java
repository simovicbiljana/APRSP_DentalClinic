package delete.reps;

import org.springframework.data.jpa.repository.JpaRepository;

import delete.jpa.Tooth;

public interface ToothRepository extends JpaRepository <Tooth, Integer>{

}
