package edu.icet.student.repository;

import edu.icet.student.dao.StudentEntity;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<StudentEntity,Long> {

}
