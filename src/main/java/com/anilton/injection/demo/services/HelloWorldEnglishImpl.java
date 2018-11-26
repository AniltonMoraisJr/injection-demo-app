package com.anilton.injection.demo.services;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("english")
public class HelloWorldEnglishImpl implements HelloWorldService {

	@Override
	public void sayHello() {
		System.out.println("Hello World");
		
	}

}