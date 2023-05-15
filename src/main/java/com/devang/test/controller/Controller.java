package com.devang.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.devang.test.service.PersonService;

@RestController
public class Controller {

	@Autowired
	private PersonService pService;
	
	@RequestMapping(path="setdata")
	public void setDB() {
		pService.setPerson();
	}
}
