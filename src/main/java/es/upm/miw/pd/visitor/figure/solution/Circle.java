package es.upm.miw.pd.visitor.figure.solution;

public class Circle extends FiguresCommon {

    private double radius;
    
    private String description;

    public Circle(String description, double radius,  int numSides) {
    	super(numSides);
        this.description = description;
    	this.radius = radius;
    }

    public double getRadius(){
    	return this.radius;
    }
    
	public void accept(Visitor v) {
		v.visit(this);
	}

}
