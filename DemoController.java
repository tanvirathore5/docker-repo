package com.docker.learn.basic.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docker.learn.basic.service.DemoService;

@RestController
public class DemoController {
	
	@Autowired
	private DemoService service;

	@GetMapping("/api/v1")
	public String hello() {
		return service.saveDemoModel();
	}

}
