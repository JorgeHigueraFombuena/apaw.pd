package es.upm.miw.pd.memento;

import es.upm.miw.pd.command.calculator.AddCommand;

public class AddCommandMementable extends AddCommand {

	private CalculadoraMementable calculator;
	
	public AddCommandMementable(CalculadoraMementable calculator) {
		super(calculator);
		this.calculator = calculator;
	}
	
	
	public void execute() {
		super.execute();
		GestorMementos.getInstance().addMemento(super.name(), calculator.createMemento());
	}

}
