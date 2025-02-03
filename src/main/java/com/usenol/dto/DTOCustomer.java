package com.usenol.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DTOCustomer {
    private Long id;
    private String name;
    private DTOAddress address;
}
