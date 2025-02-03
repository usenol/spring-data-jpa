package com.usenol.controller;

import com.usenol.dto.DTOCustomer;

public interface ICustomerController {
    DTOCustomer findCustomerById(Long id);
}
