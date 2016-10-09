package es.upm.miw.pd.command.calculator;

public class ResetCommand extends Operation {

	public ResetCommand(Calculator calculator) {
		super(calculator);
	}

	public void execute() {
		super.getCalculator().reset();
	}

	public String name() {
		return "Restaurar";
	}

}
