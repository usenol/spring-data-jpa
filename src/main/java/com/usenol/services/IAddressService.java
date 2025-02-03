package com.usenol.services;

import com.usenol.dto.DTOAddress;

public interface IAddressService {
    public DTOAddress findAddressById(Long id);
}
