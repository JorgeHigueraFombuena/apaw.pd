package es.upm.miw.pd.visitor.figure.solution;

public abstract class FiguresCommon implements Figure {

	private int numSides;
	
	FiguresCommon(int numSides){
		this.numSides = numSides;
	}
	
	public int getNumSides(){
		return numSides;
	}

}
