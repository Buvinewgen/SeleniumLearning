package com.webapi.controller;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.webapi.model.GetApi;
import com.webapi.service.getapi.GetApiService;

@RestController
@RequestMapping("/api/clients")

public class GetApiController {
	
    private final GetApiService getApiService;

    @Autowired
    public GetApiController(GetApiService getApiService) {
        this.getApiService = getApiService;
    }

    @GetMapping("")
    public List<GetApi> getAllClients() {
        return getApiService.getAllClients();
    }

}