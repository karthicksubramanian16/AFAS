package com.example.bonafide.service;

import com.example.bonafide.model.BonafideRequest;
import org.springframework.stereotype.Service;

@Service
public class BonafideService {

    public void saveRequest(BonafideRequest request) {
        // Here, you can save the request to a database or log it
        System.out.println("Received Bonafide Requisition:");
        System.out.println(request.toString());
    }
}
