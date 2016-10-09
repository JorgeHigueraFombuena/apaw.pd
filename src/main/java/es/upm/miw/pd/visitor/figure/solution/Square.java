package es.upm.miw.pd.visitor.figure.solution;

public class Square extends FiguresCommon {

    private double side;

    private String description;
    
    public Square(String description, double side, int numSides) {
    	super(numSides);
        this.description = description;
    	this.side = side;
    }
    
    public double getSide(){
    	return side;
    }

	public void accept(Visitor v) {
		v.visit(this);	
	}

}
