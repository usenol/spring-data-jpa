package com.usenol.controller.impl;

import com.usenol.controller.IStudentController;
import com.usenol.dto.DTOStudent;
import com.usenol.dto.DTOStundentIU;
import com.usenol.services.IStudentService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("rest/api/student")
public class StudentControllerImpl implements IStudentController {

    @Autowired
    private IStudentService studentService;

    @PostMapping(path = "/save")
    @Override
    public DTOStudent saveStudent(@RequestBody @Valid DTOStundentIU dtoStundentIU) {
        return studentService.saveStudent(dtoStundentIU);
    }

    @GetMapping(path = "/list")
    @Override
    public List<DTOStudent> gelAllStudent() {
        return studentService.getAllStudents();
    }

    @GetMapping(path = "/find-by-id/{id}")
    @Override
    public DTOStudent getStudentById(@PathVariable Integer id) {
        return studentService.getStudentById(id);
    }

    @GetMapping(path = "/delete/{id}")
    @Override
    public void deleteStudentById(@PathVariable Integer id) {
        studentService.deleteStudentById(id);
    }

    @GetMapping(path = "/update/{id}")
    @Override
    public DTOStudent updateStudentById(@PathVariable Integer id, @RequestBody DTOStundentIU student) {
        return studentService.updateStudent(id, student);
    }

    @GetMapping(path = "/getcoursebyid/{id}")
    @Override
    public DTOStudent getCourseByStudentId(@PathVariable Integer id) {
        return studentService.getCourseByStudentId(id);
    }
}
