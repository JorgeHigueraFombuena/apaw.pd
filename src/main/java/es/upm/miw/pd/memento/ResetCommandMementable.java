package es.upm.miw.pd.memento;

import es.upm.miw.pd.command.calculator.ResetCommand;

public class ResetCommandMementable extends ResetCommand {

	private CalculadoraMementable calculator;
	
	public ResetCommandMementable(CalculadoraMementable calculator) {
		super(calculator);
		this.calculator = calculator;
	}
	
	public void execute(){
		super.execute();
		GestorMementos.getInstance().addMemento(super.name(), calculator.createMemento());
	}

}
