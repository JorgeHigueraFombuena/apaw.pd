package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public class SubtractCommand extends Operation {

	public SubtractCommand(Calculator calculator) {
		super(calculator);
	}

	public void execute() {
		super.getCalculator().subtract(IO.getIO().readInt("Introduce el valor"));
	}

	public String name() {
		return "Restar";
	}

}
