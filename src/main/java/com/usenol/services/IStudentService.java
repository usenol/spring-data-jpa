package com.usenol.services;

import com.usenol.dto.DTOStudent;
import com.usenol.dto.DTOStundentIU;
import com.usenol.entities.Student;

import java.util.List;

public interface IStudentService {

    public DTOStudent saveStudent(DTOStundentIU student);
    public List<DTOStudent> getAllStudents();
    public DTOStudent getStudentById(int id);
    public void deleteStudentById(int id);
    public DTOStudent updateStudent(Integer id, DTOStundentIU student);
    public DTOStudent getCourseByStudentId(int id);
}
