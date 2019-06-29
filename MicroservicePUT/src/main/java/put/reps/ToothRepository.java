package put.reps;

import org.springframework.data.jpa.repository.JpaRepository;

import put.jpa.Tooth;

public interface ToothRepository extends JpaRepository <Tooth, Integer>{

}
