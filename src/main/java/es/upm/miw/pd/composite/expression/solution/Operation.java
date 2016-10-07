package es.upm.miw.pd.composite.expression.solution;

public abstract class Operation extends Expresion {

	private Expresion firstExpression;
	
	private Expresion secondExpression;
	
	public Operation(Expresion firstExpression, Expresion secondExpression){
		this.firstExpression = firstExpression;
		this.secondExpression = secondExpression;
	}

	public Expresion getFirstExpression() {
		return firstExpression;
	}

	public Expresion getSecondExpression() {
		return secondExpression;
	}
}
