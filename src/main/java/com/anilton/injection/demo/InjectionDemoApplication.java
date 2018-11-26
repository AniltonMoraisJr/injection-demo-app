package com.anilton.injection.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.anilton.injection.demo.controllers.InjectionDemoController;

@SpringBootApplication
public class InjectionDemoApplication {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(InjectionDemoApplication.class, args);
		InjectionDemoController idc = (InjectionDemoController) ctx.getBean("injectionDemoController");
		
		idc.showMessage();
	}
}
