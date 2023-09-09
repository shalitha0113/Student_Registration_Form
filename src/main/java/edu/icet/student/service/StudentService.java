package edu.icet.student.service;

import edu.icet.student.dao.StudentEntity;
import edu.icet.student.dto.Student;

public interface StudentService {
    //Create Operation
    void setStudent(Student student);

    // Read operation
    Iterable<StudentEntity> getAll();



    //Update operation
    StudentEntity updateStudent(StudentEntity student, Long id);

    //Delete Operation
   // void deleteStudentById(Long id);

    boolean deleteStudent(Long id);

    Iterable<StudentEntity> getStudentByName(String firstName);
}
