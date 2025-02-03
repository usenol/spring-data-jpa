package com.usenol.controller;

import com.usenol.dto.DTOStudent;
import com.usenol.dto.DTOStundentIU;
import com.usenol.entities.Student;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface IStudentController {

    public DTOStudent saveStudent(DTOStundentIU student);
    public List<DTOStudent> gelAllStudent();
    public DTOStudent getStudentById(@PathVariable Integer id);
    public void deleteStudentById(@PathVariable Integer id);
    public DTOStudent updateStudentById(@PathVariable Integer id, DTOStundentIU student);
    public DTOStudent getCourseByStudentId(@PathVariable Integer id);
}
