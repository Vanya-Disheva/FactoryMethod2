package com.phone;

public abstract class OSBase implements OS 
{
	String spec = "";
	
	public void setSpec(String spec) {
		this.spec = spec;
	}
	
	public abstract void spec();
}
