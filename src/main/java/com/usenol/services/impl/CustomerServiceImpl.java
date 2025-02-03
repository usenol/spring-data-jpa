package com.usenol.services.impl;

import com.usenol.dto.DTOAddress;
import com.usenol.dto.DTOCustomer;
import com.usenol.entities.Address;
import com.usenol.entities.Customer;
import com.usenol.repository.CustomerRepository;
import com.usenol.services.ICustomerservice;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerServiceImpl implements ICustomerservice {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public DTOCustomer findCustomerById(Long id) {
        DTOCustomer dtoCustomer = new DTOCustomer();
        DTOAddress dtoAddress = new DTOAddress();
        Optional<Customer> optional = customerRepository.findById(id);

        if (optional.isEmpty()) {
            return null;
        }

        Customer customer = optional.get();
        Address address = optional.get().getAddress();

        BeanUtils.copyProperties(customer, dtoCustomer);
        BeanUtils.copyProperties(address, dtoAddress);

        dtoCustomer.setAddress(dtoAddress);

        return dtoCustomer;
    }
}
