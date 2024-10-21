package com.example.bonafide.controller;

import com.example.bonafide.model.BonafideRequest;
import com.example.bonafide.service.BonafideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/submit-bonafide-requisition")
public class BonafideController {

    @Autowired
    private BonafideService bonafideService;

    @PostMapping
    public String submitForm(@ModelAttribute BonafideRequest bonafideRequest) {
        bonafideService.processBonafideRequest(bonafideRequest);
        return "success"; // returns the success.html page on successful submission
    }
}
