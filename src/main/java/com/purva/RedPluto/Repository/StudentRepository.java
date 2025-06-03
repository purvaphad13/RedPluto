package com.purva.RedPluto.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import com.purva.RedPluto.model.Student;

public interface StudentRepository extends JpaRepository<Student, Long>{
	
	List<Student> findByNameContainingIgnoreCase(String name);
    List<Student> findByDivision(String division);
}
