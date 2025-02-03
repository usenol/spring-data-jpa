package com.usenol.controller;

import com.usenol.dto.DTOHome;

public interface IHomeController {
    public DTOHome findHomeById(Long id);
}
