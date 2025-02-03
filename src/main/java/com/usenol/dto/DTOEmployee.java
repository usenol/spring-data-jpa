package com.usenol.dto;

import com.usenol.entities.Department;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DTOEmployee {
    private Long id;
    private String name;
    private DTODepartment department;
}
