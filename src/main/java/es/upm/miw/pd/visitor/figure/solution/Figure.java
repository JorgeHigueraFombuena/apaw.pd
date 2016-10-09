package es.upm.miw.pd.visitor.figure.solution;

public interface Figure {
	
	void accept(Visitor v);
	
	int getNumSides();

}
