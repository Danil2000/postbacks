package com.example.postbacks.controllers;

import com.example.postbacks.models.*;
import com.example.postbacks.repo.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PostbackController {
    @Autowired
    LeadsRepo leadsRepo;

    @PostMapping("/leads")
    public ResponseEntity getPostback(PostbackLeads lead) {
        leadsRepo.save(lead);
        return new ResponseEntity(HttpStatus.OK);
    }

}
