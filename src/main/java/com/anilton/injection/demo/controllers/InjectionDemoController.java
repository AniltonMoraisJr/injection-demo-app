package com.anilton.injection.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.anilton.injection.demo.services.HelloWorldService;

@Controller
public class InjectionDemoController {
	
	
	private HelloWorldService helloWorldService;
	
	@Autowired
	public void setHelloWorldService(HelloWorldService hws) {
		this.helloWorldService = hws;
	}
	
	public void showMessage() {
		helloWorldService.sayHello();
	}
}