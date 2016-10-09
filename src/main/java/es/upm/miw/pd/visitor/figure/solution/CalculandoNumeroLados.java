package es.upm.miw.pd.visitor.figure.solution;

public class CalculandoNumeroLados extends Visitor {
	
	public CalculandoNumeroLados() {
		super();
	}

	@Override
	void visit(Circle c) {
		super.addAcumulatorInt(c.getNumSides());
	}

	@Override
	void visit(Square s) {
		super.addAcumulatorInt(s.getNumSides());
	}

	@Override
	void visit(Triangle t) {
		super.addAcumulatorInt(t.getNumSides());
	}

}
