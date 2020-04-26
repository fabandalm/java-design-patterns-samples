package com.falmeida.tech.sample01;

public class Resource {

	private static Resource instance = new Resource();
	
	private Resource() {
		
	}

	public static Resource getInstance() {
		return instance;
	}
	
}
