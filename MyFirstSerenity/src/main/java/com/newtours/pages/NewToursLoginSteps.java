package com.newtours.pages;

import net.thucydides.core.annotations.Step;

public class NewToursLoginSteps {
	
	private final String USUARIO = "jdordonez";
	private final String PASSWORD = "97022602";
	
	Homepage page;
	
	@Step
	public void openApplication() {
		page.open();
	}
	
	@Step("Escribiendo datos")
	public void writeData() {
		page.writeData(USUARIO, PASSWORD);
	}
	
	@Step("Enviando datos")
	public void sendData() {
		page.sendData();
	}
}
