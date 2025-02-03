package com.usenol.services.impl;

import com.usenol.dto.DTOAddress;
import com.usenol.dto.DTOCustomer;
import com.usenol.entities.Address;
import com.usenol.entities.Customer;
import com.usenol.repository.AddressRepository;
import com.usenol.services.IAddressService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class AddressServiceImpl implements IAddressService {

    @Autowired
    public AddressRepository addressRepository;


    @Override
    public DTOAddress findAddressById(Long id) {
        DTOAddress dtoAddress = new DTOAddress();
        DTOCustomer dtoCustomer = new DTOCustomer();
        Optional<Address> optional = addressRepository.findById(id);

        if (optional.isEmpty()){ return null; }

        Address address = optional.get();
        Customer customer = address.getCustomer();

        BeanUtils.copyProperties(address, dtoAddress);
        BeanUtils.copyProperties(customer, dtoCustomer);

        dtoAddress.setCustomer(dtoCustomer);

        return dtoAddress;
    }
}
