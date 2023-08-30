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
        StudentEntity entityById=repository.findById(id).get();
        if(null !=(student.getFirstName()) && !"".equalsIgnoreCase(student.getFirstName())) {
            entityById.setFirstName(student.getFirstName());
        }
        if(null !=(student.getLastName()) && !"".equalsIgnoreCase(student.getLastName())) {
            entityById.setLastName(student.getLastName());
        }
        if(null!=(student.getEmail()) && !"".equalsIgnoreCase((student.getEmail()))) {
            entityById.setEmail(student.getEmail());
        }
        if(null!=(student.getDob()) && !"".equalsIgnoreCase((student.getDob()))) {
            entityById.setDob(student.getDob());
        }

        if(null!=(student.getGender()) && !"".equalsIgnoreCase((student.getGender()))) {
            entityById.setGender(student.getGender());
        }
        if(null!=(student.getAddress()) && !"".equalsIgnoreCase((student.getAddress()))) {
            entityById.setAddress(student.getAddress());
        }
        if(null!=(student.getTelNo()) && !"".equalsIgnoreCase((student.getTelNo()))) {
            entityById.setTelNo(student.getTelNo());
        }
        if(null!=(student.getBatch()) && !"".equalsIgnoreCase((student.getBatch()))) {
            entityById.setBatch(student.getBatch());
        }
        return repository.save(entityById);
    }

    @Override
    public void deleteStudentById(Long id) {
        repository.deleteById(id);
    }

}
