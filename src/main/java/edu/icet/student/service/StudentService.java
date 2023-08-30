package edu.icet.student.service;

import edu.icet.student.dao.StudentEntity;
import edu.icet.student.dto.Student;

public interface StudentService {
    void setStudent(Student student);

    Iterable<StudentEntity> getAll();


}
