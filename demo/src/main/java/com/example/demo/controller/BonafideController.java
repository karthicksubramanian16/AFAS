package com.example.bonafide.controller;

import com.example.bonafide.model.BonafideRequest;
import com.example.bonafide.service.BonafideService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class BonafideController {

    @Autowired
    private BonafideService bonafideService;

    @GetMapping("/")
    public String showForm() {
        return "bonafideForm";  // Ensure bonafideForm.html exists in your frontend
    }

    @PostMapping("/submit-bonafide-requisition")
    public String submitBonafide(@ModelAttribute BonafideRequest request) {
        bonafideService.saveRequest(request);  // Save the form data
        return "success";  // Redirect to a success page
    }
}
