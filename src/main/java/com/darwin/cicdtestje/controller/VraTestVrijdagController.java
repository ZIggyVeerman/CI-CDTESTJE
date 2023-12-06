package com.darwin.cicdtestje.controller;

import com.darwin.cicdtestje.service.VraTestVrijdagService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/VraTest")
public class VraTestVrijdagController {
    @Autowired
    private VraTestVrijdagService vraTestVrijdagService;

}
