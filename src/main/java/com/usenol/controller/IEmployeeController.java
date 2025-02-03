package com.usenol.controller;

import com.usenol.dto.DTOEmployee;

import java.util.List;

public interface IEmployeeController {
    public List<DTOEmployee> getAllEmployees();
}
