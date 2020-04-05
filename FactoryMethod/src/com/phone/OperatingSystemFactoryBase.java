package com.phone;

public abstract class OperatingSystemFactoryBase {
	public abstract OS createOS(String name);
	
	public OS produceOS(String name) {
		OS product = createOS(name);
		
		return product;
	}
}
