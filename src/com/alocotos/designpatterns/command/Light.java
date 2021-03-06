package com.alocotos.designpatterns.command;

//Receiver
public class Light {
	
	private boolean isOn = false;
	
	public boolean isOn() {
		return isOn;
	}
	
	public void toggle() {
		if(isOn) {
			off();
			isOn = false;
		} else {
			on();
			isOn = true;
		}
	}

	public void on() {
		System.out.println("Light switched to on.");
	}
	
	public void off() {
		System.out.println("Light switched off.");
	}
}
