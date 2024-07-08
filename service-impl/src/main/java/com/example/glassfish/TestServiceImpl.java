package com.example.glassfish;

public class TestServiceImpl implements TestService {

	@Override
	public String sayHello(String name) {
		return "Hello " + name;
	}

}
