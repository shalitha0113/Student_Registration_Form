package edu.icet.student.controller;

import edu.icet.student.dao.StudentEntity;
import edu.icet.student.dto.Student;
import edu.icet.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService service;

    @PostMapping
    public void setStudent(@RequestBody Student student) {
        service.setStudent(student);
    }

    @GetMapping
    public Iterable<StudentEntity> getAll() {
        return service.getAll();
    }
}