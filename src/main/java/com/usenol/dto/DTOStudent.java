package com.usenol.dto;

import com.usenol.entities.Course;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import lombok.*;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class DTOStudent {
    private String firstName;
    private String lastName;
    private List<DTOCourse> courseList;
}
