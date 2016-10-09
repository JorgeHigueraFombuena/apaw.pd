package es.upm.miw.pd.visitor.figure.solution;

public abstract class Visitor {
	
	private double acumulatorDouble;
	
	private int acumulatorInt;
	
	public Visitor(){
		acumulatorDouble = 0.0;
		acumulatorInt = 0;
	}
	
	void addAcumulatorDouble(double d){
		acumulatorDouble += d;
	}

	double getAcumulatoDouble(){
		return acumulatorDouble;
	}
	
	void addAcumulatorInt(int d){
		acumulatorInt += d;
	}

	int getAcumulatoInt(){
		return acumulatorInt;
	}
	
	abstract void visit(Circle c);
	
	abstract void visit(Square s);
	
	abstract void visit(Triangle t);
	
}
