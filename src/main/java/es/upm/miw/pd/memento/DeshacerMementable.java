package es.upm.miw.pd.memento;

import es.upm.miw.pd.command.calculator.Calculator;
import es.upm.miw.pd.command.calculator.Operation;
import upm.jbb.IO;

public class DeshacerMementable extends Operation{

	private CalculadoraMementable calculator;
	
	public DeshacerMementable(CalculadoraMementable calculator) {
		super(calculator);
		this.calculator = calculator;
	}

	@Override
	public void execute() {
		String key = (String) IO.getIO().select(GestorMementos.getInstance().keys());
		calculator.restoreMemento(GestorMementos.getInstance().getMemento(key));
	}

	@Override
	public String name() {
		return "Deshacer";
	}

}
