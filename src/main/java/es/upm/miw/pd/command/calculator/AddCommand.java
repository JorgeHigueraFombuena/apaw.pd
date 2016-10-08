package es.upm.miw.pd.command.calculator;

import upm.jbb.IO;

public class AddCommand extends Operation {

	public AddCommand(Calculator calculator) {
		super(calculator);
	}

	public void execute() {
		int primerValor = IO.getIO().readInt("Introduce el número");
		super.getCalculator().add(primerValor);
	}

	public String name() {
		return "AddCommand";
	}

}
