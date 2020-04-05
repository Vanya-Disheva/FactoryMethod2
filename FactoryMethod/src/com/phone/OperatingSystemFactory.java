package com.phone;

public class OperatingSystemFactory extends OperatingSystemFactoryBase
{
	public OS getInstance(String str)
	{
		if(str.equals("Open")) {
		   Andorid android = new Andorid();
		   android.setSpec("Most Powerful OS");
		   return android;
		} else if(str.equals("Closed")) {
			IOS ios = new IOS();
			ios.setSpec("MostSecure OS");
			return ios;
		} else {
			Windows window = new Windows();
			window.setSpec("I am abt to die...");
			return window;
		}
	}

	@Override
	public OS createOS(String name) {
		return getInstance(name);
	}

}