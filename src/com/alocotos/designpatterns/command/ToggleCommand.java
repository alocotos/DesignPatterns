package com.alocotos.designpatterns.command;

//Concrete Command
public class ToggleCommand implements Command {

	private Light light;

	public ToggleCommand(Light light) {
			this.light = light;
		}

	@Override
	public void execute() {
		light.toggle();

	}

}
