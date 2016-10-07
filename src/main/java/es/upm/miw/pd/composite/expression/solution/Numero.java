package es.upm.miw.pd.composite.expression.solution;

public class Numero extends Expresion {

	private int number;
	
	public Numero(int number){
		this.number = number;
	}
	
	@Override
	int operar() {
		return number;
	}

	@Override
	public String toString() {
		return String.valueOf(number);
	}
}
