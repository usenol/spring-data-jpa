package com.usenol.controller.impl;

import com.usenol.configurations.DataSource;
import com.usenol.configurations.GlobalProperties;
import com.usenol.configurations.Server;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "rest/api/property")
public class PropertySourceController {

    @Autowired
    private GlobalProperties globalProperties;

    @GetMapping("/datasource")
    public DataSource getDataSource(){
        return null;
    }

    @GetMapping("/getServers")
    public List<Server> getServers(){
        return globalProperties.getServers();
    }
}
