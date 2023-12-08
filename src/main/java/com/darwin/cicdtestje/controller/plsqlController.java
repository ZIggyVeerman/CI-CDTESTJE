package com.darwin.cicdtestje.controller;

import com.darwin.cicdtestje.service.plsqlTest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/plsql")
public class plsqlController {

    private final plsqlTest plsqlTestService; // Define a field for the service

    @Autowired
    public plsqlController(plsqlTest plsqlTestService) {
        this.plsqlTestService = plsqlTestService; // Assign the injected service to the field
    }

    @GetMapping("/callFunction")
    public String callFunction(@RequestParam String input) {
        return plsqlTestService.callExampleFunction(input); // Use the service field here
    }
}