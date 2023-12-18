package com.example.residentialproperty.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.example.residentialproperty.service.ResidentialPropertyService;

@RestController
public class ResidentialPropertyController {
	
	@Autowired
	private ResidentialPropertyService residentialPropertyService;
	
}
