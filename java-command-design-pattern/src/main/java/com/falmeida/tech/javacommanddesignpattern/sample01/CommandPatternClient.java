package com.falmeida.tech.javacommanddesignpattern.sample01;

public class CommandPatternClient {

	public static void main(String[] args) {
		
		Document doc = new Document();  
        
        ActionListenerCommand clickOpen = new ActionOpen(doc);  
        
        ActionListenerCommand clickSave = new ActionSave(doc);  
          
        Invoker invoker = new Invoker(clickOpen, clickSave);  
          
        invoker.clickOpen();  
        invoker.clickSave();  
        
	}
	
}
