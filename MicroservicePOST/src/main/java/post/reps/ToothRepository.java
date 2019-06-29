package post.reps;

import org.springframework.data.jpa.repository.JpaRepository;

import post.jpa.Tooth;

public interface ToothRepository extends JpaRepository <Tooth, Integer>{

}
