package es.upm.miw.pd.memento;

import es.upm.miw.pd.command.calculator.SubtractCommand;

public class SubstractCommandMementable extends SubtractCommand {

	private CalculadoraMementable calculator;
	
	public SubstractCommandMementable(CalculadoraMementable calculator) {
		super(calculator);
		this.calculator = calculator;
	}
	
	public void execute(){
		super.execute();
		GestorMementos.getInstance().addMemento(super.name(), calculator.createMemento());
	}

}
