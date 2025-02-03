package com.usenol.services;

import com.usenol.dto.DTOCustomer;

public interface ICustomerservice {
    public DTOCustomer findCustomerById(Long id);
}
