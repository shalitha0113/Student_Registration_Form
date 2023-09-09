package edu.icet.student.controller;

import edu.icet.student.dao.StudentEntity;
import edu.icet.student.dto.Student;
import edu.icet.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
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

    @GetMapping("/{firstName}")
    public Iterable<StudentEntity> getStudentByName(@PathVariable String firstName) {
        return service.getStudentByName(firstName);
    }


    @PutMapping("/{id}")
    public StudentEntity updateStudent(@PathVariable Long id,@RequestBody StudentEntity student){
        return service.updateStudent(student,id);
    }

    /*
    @DeleteMapping("/{id}")
    public void deleteStudentById(@PathVariable("id") Long id){
        service.deleteStudentById(id);
    }


     */
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deleteStudent(@PathVariable Long id) {
        boolean deleted = service.deleteStudent(id);
        if (deleted) {
            return ResponseEntity.ok("Student deleted successfully");
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
