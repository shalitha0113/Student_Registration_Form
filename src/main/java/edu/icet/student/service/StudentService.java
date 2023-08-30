package edu.icet.student.service;

import edu.icet.student.dao.StudentEntity;
import edu.icet.student.dto.Student;

public interface StudentService {
    //Create Operation
    void setStudent(Student student);

    // Read operation
    Iterable<StudentEntity> getAll();

    //Delete Operation
    void deleteStudentById(Long id);


}
