package com.usenol.services.impl;

import com.usenol.dto.DTOStudent;
import com.usenol.dto.DTOStundentIU;
import com.usenol.entities.Student;
import com.usenol.repository.StudentRepository;
import com.usenol.services.IStudentService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public DTOStudent saveStudent(DTOStundentIU dtoStudentIU) {
        DTOStudent response = new DTOStudent();
        Student student = new Student();
        BeanUtils.copyProperties(dtoStudentIU, student);

        Student dbStudent = studentRepository.save(student);
        BeanUtils.copyProperties(dbStudent, response);
        return response;
    }

    @Override
    public List<DTOStudent> getAllStudents() {
        List<DTOStudent> dtoStudentsList = new ArrayList<>();
        List<Student> students = studentRepository.findAll();

        for (Student student : students) {
            DTOStudent dtoStudent = new DTOStudent();
            BeanUtils.copyProperties(student, dtoStudent);
            dtoStudentsList.add(dtoStudent);
        }
        return dtoStudentsList;
    }

    @Override
    public DTOStudent getStudentById(int id) {
        DTOStudent dtoStudent = new DTOStudent();
        Optional<Student> student = studentRepository.findById(id);
        if (student.isPresent()) {
            Student dbStudent = student.get();
            BeanUtils.copyProperties(dbStudent, dtoStudent);
        }
        return dtoStudent;
    }

    @Override
    public void deleteStudentById(int id) {
        Optional<Student> student = studentRepository.findById(id);
        if (student.isPresent()) {
            studentRepository.delete(student.get());
        }
    }

    @Override
    public DTOStudent updateStudent(Integer id, DTOStundentIU dtoStundentIU) {
        Optional<Student> optional = studentRepository.findById(id);
        DTOStudent dtoStudent = new DTOStudent();
        if (optional.isPresent()) {
            Student dbStudent = optional.get();

            dbStudent.setFirstName(dtoStundentIU.getFirstName());
            dbStudent.setLastName(dtoStundentIU.getLastName());
            dbStudent.setBirthDate(dtoStundentIU.getBirthDate());

            Student updatedStudent = studentRepository.save(dbStudent);
            BeanUtils.copyProperties(updatedStudent, dtoStudent);

            return dtoStudent;
        }
        return null;
    }
}
