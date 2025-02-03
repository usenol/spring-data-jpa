package com.usenol.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
@JsonInclude(JsonInclude.Include.NON_NULL)
public class DTOAddress {
    private Long id;
    private String addressName;
    private DTOCustomer customer;
}
