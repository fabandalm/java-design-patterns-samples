package com.falmeida.tech.javacommanddesignpattern.sample01;

public class Invoker {

    private ActionListenerCommand clickOpen;  
    
    private ActionListenerCommand clickSave;

	public Invoker(ActionListenerCommand clickOpen, ActionListenerCommand clickSave) {
		this.clickOpen = clickOpen;
		this.clickSave = clickSave;
	}  
	
	public void clickOpen() {
		clickOpen.execute();
	}
	
	public void clickSave() {
		clickSave.execute();
	}
	
}
