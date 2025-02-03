package com.usenol.services;

import com.usenol.dto.DTOHome;
import org.springframework.stereotype.Service;

public interface IHomeService {
    public DTOHome findHomeById(Long id);
}
