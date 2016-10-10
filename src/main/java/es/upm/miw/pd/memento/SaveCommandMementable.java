package es.upm.miw.pd.memento;

import es.upm.miw.pd.command.calculator.Calculator;
import es.upm.miw.pd.command.calculator.Operation;

public class SaveCommandMementable extends Operation {

	public CalculadoraMementable calculator;
	
	public SaveCommandMementable(CalculadoraMementable calculator) {
		super(calculator);
		this.calculator = calculator;
	}

	@Override
	public void execute() {
		GestorMementos.getInstance().addMemento(name(), calculator.createMemento());
	}

	@Override
	public String name() {
		return "Guardar";
	}

}
