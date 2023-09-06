package edu.icet.student.service;

import edu.icet.student.dao.StudentEntity;
import edu.icet.student.dto.Student;
import edu.icet.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository repository;

    public void setStudent(Student student) {
        StudentEntity entity = new StudentEntity();
        entity.setFirstName(student.getFirstName());
        entity.setLastName(student.getLastName());
        entity.setEmail(student.getEmail());
        entity.setDob(student.getDob());
        entity.setGender(student.getGender());
        entity.setAddress(student.getAddress());
        entity.setTelNo(student.getTelNo());
        entity.setBatch(student.getBatch());
        repository.save(entity);
    }

    @Override
    public Iterable<StudentEntity> getAll() {
        return repository.findAll();
    }

    @Override
    public StudentEntity updateStudent(StudentEntity student, Long id) {
        StudentEntity entityById = repository.findById(id).get();
        entityById.setFirstName(student.getFirstName());
        entityById.setLastName(student.getLastName());
        entityById.setEmail(student.getEmail());
        entityById.setDob(student.getDob());
        entityById.setGender(student.getGender());
        entityById.setAddress(student.getAddress());
        entityById.setTelNo(student.getTelNo());
        entityById.setBatch(student.getBatch());
        return repository.save(entityById);
    }

    @Override
    public void deleteStudentById(Long id) {
        repository.deleteById(id);
    }

}
