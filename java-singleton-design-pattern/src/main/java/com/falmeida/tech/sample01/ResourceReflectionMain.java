package com.falmeida.tech.sample01;

import java.lang.reflect.Constructor;

public class ResourceReflectionMain {

	public static void main(String[] args) {
		
	     Resource instance1 = Resource.getInstance(); 
	     
	     Resource instance2 = null; 
	     
	     try{ 
            
	    	Constructor<?>[] constructors =  Resource.class.getDeclaredConstructors(); 
            for (Constructor<?> constructor : constructors){ 
                // Below code will destroy the singleton pattern 
                constructor.setAccessible(true); 
                instance2 = (Resource) constructor.newInstance(); 
                break; 
            } 
        }catch (Exception e){ 
            e.printStackTrace(); 
        } 
	          
	    System.out.println("instance1.hashCode():- " + instance1.hashCode()); 
	    
	    System.out.println("instance2.hashCode():- " + instance2.hashCode());
		
	}
	
}
