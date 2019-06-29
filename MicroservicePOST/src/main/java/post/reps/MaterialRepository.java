package post.reps;

import org.springframework.data.jpa.repository.JpaRepository;

import post.jpa.Material;

public interface MaterialRepository extends JpaRepository <Material, Integer>{

}
