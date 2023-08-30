package edu.icet.student.controller;

import edu.icet.student.dao.StudentEntity;
import edu.icet.student.dto.Student;
import edu.icet.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@RestController
@CrossOrigin
//@RequestMapping("/student")
public class StudentController {
    @Autowired
    StudentService service;

    @PostMapping("/studentt")
    public void setStudent(@RequestBody Student student) {
        service.setStudent(student);
    }

    @GetMapping("/student")
    public Iterable<StudentEntity> getAll() {
        return service.getAll();
    }

    @DeleteMapping("/student/{id}")
    public String deleteStudentById(@PathVariable("id") Long id){
        service.deleteStudentById(id);
        return "Student Details Deleted.";
    }
}
