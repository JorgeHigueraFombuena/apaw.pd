package es.upm.miw.pd.visitor.figure.solution;

public class Triangle extends FiguresCommon {
    private double base;

    private double height;
    
    private String description;

    public Triangle(String description, double base, double height, int numSides) {
    	super(numSides);
        this.description = description;
        this.base = base;
        this.height = height;
    }
    
	public double getBase() {
		return base;
	}

	public double getHeight() {
		return height;
	}

	public void accept(Visitor v) {
		v.visit(this);
	}

//    @Override
//    public double area() {
//        return base * height * 0.5;
//    }

}
