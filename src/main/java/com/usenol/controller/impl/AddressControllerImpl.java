package com.usenol.controller.impl;

import com.usenol.controller.IAddressController;
import com.usenol.dto.DTOAddress;
import com.usenol.services.IAddressService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/address")
public class AddressControllerImpl implements IAddressController {

    @Autowired
    public IAddressService addressService;

    @GetMapping(path = "/list/{id}")
    @Override
    public DTOAddress findAddressById(@PathVariable(name = "id") Long id) {
        return addressService.findAddressById(id);
    }
}
