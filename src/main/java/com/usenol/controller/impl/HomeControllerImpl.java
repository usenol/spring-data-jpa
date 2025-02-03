package com.usenol.controller.impl;

import com.usenol.controller.IHomeController;
import com.usenol.dto.DTOHome;
import com.usenol.services.IHomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/rest/api/home")
public class HomeControllerImpl implements IHomeController {

    @Autowired
    public IHomeService homeService;

    @Override
    @GetMapping(path = "/{id}")
    public DTOHome findHomeById(@PathVariable(name = "id") Long id){
       return homeService.findHomeById(id);
    }
}
