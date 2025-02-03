package com.usenol.dto;


import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class DTOStundentIU {

    @NotEmpty(message = "First Name alanı boş bırakılamaz!")
    @Min(3)
    @Max(10)
    private String firstName;

    @Size(min = 3, max = 20)
    private String lastName;

    private Date birthDate;
}
