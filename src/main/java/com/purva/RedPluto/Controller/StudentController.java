package com.purva.RedPluto.Controller;

import com.purva.RedPluto.model.Student;
import com.purva.RedPluto.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/students")
@CrossOrigin(origins = "*")
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping
    public List<Student> getAll() {
        return service.getAllStudents();
    }

    @PostMapping
    public Student save(@RequestBody Student student) {
        return service.saveStudent(student);
    }

    @GetMapping("/{id}")
    public Optional<Student> getById(@PathVariable Long id) {
        return service.getStudentById(id);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        service.deleteStudent(id);
    }

    @GetMapping("/search/name")
    public List<Student> searchByName(@RequestParam String name) {
        return service.searchByName(name);
    }

    @GetMapping("/search/division")
    public List<Student> searchByDivision(@RequestParam String division) {
        return service.searchByDivision(division);
    }
}


