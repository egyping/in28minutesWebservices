package com.in28minutes.rest.webservices.restfulwebservices;

public class HelloBean {

	private String message;

	public HelloBean(String message) {
		this.setMessage(message);
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
	
	public String getMessage() {
		return message;
	}

	@Override
	public String toString() {
		return String.format("HelloBean [message={Hamada}%s]", message);
	}

	
}
