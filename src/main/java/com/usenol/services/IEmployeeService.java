package com.usenol.services;

import com.usenol.dto.DTOEmployee;
import com.usenol.entities.Employee;

import java.util.List;

public interface IEmployeeService  {
    public List<DTOEmployee> getAllEmployees();
}
