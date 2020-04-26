package com.falmeida.tech.javacommanddesignpattern.sample01;

public class ActionOpen implements ActionListenerCommand {

	private Document doc;
	
	public ActionOpen(Document doc) {
		this.doc = doc;
	}

	@Override
	public void execute() {
		doc.open();
	}

}
