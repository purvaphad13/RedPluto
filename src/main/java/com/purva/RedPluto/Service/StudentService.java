package com.purva.RedPluto.Service;

import com.purva.RedPluto.model.Student;
import com.purva.RedPluto.Repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repo;

    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    public Student saveStudent(Student student) {
        student.calculatePercentageAndDivision();
        return repo.save(student);
    }

    public Optional<Student> getStudentById(Long id) {
        return repo.findById(id);
    }

    public void deleteStudent(Long id) {
        repo.deleteById(id);
    }

    public List<Student> searchByName(String name) {
        return repo.findByNameContainingIgnoreCase(name);
    }

    public List<Student> searchByDivision(String division) {
        return repo.findByDivision(division);
    }

}
