package com.usenol.controller.impl;

import com.usenol.controller.IEmployeeController;
import com.usenol.dto.DTOEmployee;
import com.usenol.services.IEmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("rest/api/employee")
public class EmployeeControllerImpl implements IEmployeeController {

    @Autowired
    private IEmployeeService employeeService;

    @GetMapping(path = "/list")
    @Override
    public List<DTOEmployee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }
}
