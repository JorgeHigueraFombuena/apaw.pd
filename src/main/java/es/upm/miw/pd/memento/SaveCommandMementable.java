package es.upm.miw.pd.memento;

import es.upm.miw.pd.command.calculator.Calculator;
import es.upm.miw.pd.command.calculator.Operation;
import upm.jbb.IO;

public class SaveCommandMementable extends Operation {

	public CalculadoraMementable calculator;
	
	public SaveCommandMementable(CalculadoraMementable calculator) {
		super(calculator);
		this.calculator = calculator;
	}

	@Override
	public void execute() {
		GestorMementos.getInstance().addMemento((String)IO.getIO().readString("Nombre del memento"),
				calculator.createMemento());
	}

	@Override
	public String name() {
		return "Guardar";
	}

}
