package com.in28minutes.rest.webservices.restfulwebservices;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	//@RequestMapping(method = RequestMethod.GET, path = "/hello")
	@GetMapping("/hello")
	public String helloWorld() {
		return "Hello GET!";
	}
	
	@GetMapping("/hello-bean")
	public HelloBean HelloBean() {
		return new HelloBean("Hello Bean");
	}
	
	@GetMapping("/hello-bean/{name}")
	public HelloBean HelloBeanWithParam(@PathVariable String name) {
		return new HelloBean(String.format("Hello Bean with param is, %s", name));
	}
}

