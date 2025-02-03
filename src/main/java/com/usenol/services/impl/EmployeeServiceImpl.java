package com.usenol.services.impl;

import com.usenol.dto.DTODepartment;
import com.usenol.dto.DTOEmployee;
import com.usenol.entities.Employee;
import com.usenol.repository.EmployeeRepository;
import com.usenol.services.IEmployeeService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EmployeeServiceImpl implements IEmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<DTOEmployee> getAllEmployees() {
        List<DTOEmployee> dtoEmployeeList = new ArrayList<>();
        List<Employee> dbEmployeeList = employeeRepository.findAll();

        if(dbEmployeeList != null && !dbEmployeeList.isEmpty()) {
            for(Employee employee : dbEmployeeList) {
                DTOEmployee dtoEmployee = new DTOEmployee();
                BeanUtils.copyProperties(employee, dtoEmployee);

                DTODepartment department = new DTODepartment(employee.getDepartment().getId(), employee.getDepartment().getDepartmentName());

                dtoEmployee.setDepartment(department);
                dtoEmployeeList.add(dtoEmployee);
            }
        }
        return dtoEmployeeList;
    }
}
