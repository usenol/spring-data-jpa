package com.usenol.controller;

import com.usenol.dto.DTOAddress;

public interface IAddressController {
    public DTOAddress findAddressById(Long id);
}
