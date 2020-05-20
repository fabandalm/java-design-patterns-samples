package com.falmeida.tech.sample02;

import java.io.Serializable;

public class Resource implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static Resource instance = new Resource();
	
	private Resource() {
		
	}

	public static Resource getInstance() {
		return instance;
	}
	
    protected Object readResolve() {  
        return null;
    }  
	
}
