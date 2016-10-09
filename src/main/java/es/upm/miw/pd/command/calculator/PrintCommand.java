package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public class PrintCommand extends Operation {

	public PrintCommand(Calculator calculator) {
		super(calculator);
	}

	public void execute() {
		IO.getIO().println(super.getCalculator().getTotal());
	}

	public String name() {
		return "Imprimir";
	}

}
