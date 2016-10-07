package es.upm.miw.pd.composite.expression.solution;

public class Multiplicacion extends Operation {

	public Multiplicacion(Expresion firstExpression, Expresion secondExpression){
		super(firstExpression, secondExpression);
	}
	
	@Override
	int operar() {
		return super.getFirstExpression().operar() * super.getSecondExpression().operar();
	}

	@Override
	public String toString() {
		return "(" + super.getFirstExpression().toString() + "*" + super.getSecondExpression().toString() + ")";
	}
}
