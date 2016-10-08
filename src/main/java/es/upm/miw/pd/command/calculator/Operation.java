package es.upm.miw.pd.command.calculator;

public abstract class Operation implements Comando {

	private Calculator calculator;
	
	public Operation(Calculator calculator){
		this.calculator = calculator;
	}

	public Calculator getCalculator(){
		return calculator;
	}
}
