package es.upm.miw.pd.composite.expression.solution;

public class Suma extends Operation {

	
	public Suma(Expresion firstExpression, Expresion secondExpression){
		super(firstExpression, secondExpression);
	}
	
	@Override
	int operar() {
		return super.getFirstExpression().operar() + super.getSecondExpression().operar();
	}

	@Override
	public String toString() {
		return "(" + super.getFirstExpression().toString() + "+" + super.getSecondExpression().toString() + ")";
	}

}
