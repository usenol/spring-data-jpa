package com.usenol.controller.impl;

import com.usenol.controller.ICustomerController;
import com.usenol.dto.DTOCustomer;
import com.usenol.services.ICustomerservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("rest/api/customer")
public class CustomerControllerImpl implements ICustomerController {

    @Autowired
    private ICustomerservice customerservice;

    @Override
    @GetMapping(path = "/list/{id}")
    public DTOCustomer findCustomerById(@PathVariable(name = "id") Long id) {
        return customerservice.findCustomerById(id);
    }
}
