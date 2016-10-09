package es.upm.miw.pd.visitor.figure.solution;

public class CalculandoArea extends Visitor {
	
	public CalculandoArea(){
		super();
	}

	@Override
	void visit(Circle c) {
		super.addAcumulatorDouble(Math.PI * c.getRadius() * c.getRadius());
	}

	@Override
	void visit(Square s) {
		super.addAcumulatorDouble(s.getSide() * s.getSide());
	}

	@Override
	void visit(Triangle t) {
		super.addAcumulatorDouble((t.getBase() * t.getHeight()) / 2);
	}

}
