package es.upm.miw.pd.visitor.figure.solution;

import java.util.ArrayList;
import java.util.List;

public class FiguresManager {

    private List<Figure> figures;

    public FiguresManager() {
        figures = new ArrayList<Figure>();
    }

    public void add(Figure figure) {
        figures.add(figure);
    }

    public double totalArea() {
    	Visitor v = new CalculandoArea();
    	visitFigures(v);
    	return v.getAcumulatoDouble();
    }

    public int totalNumberOfSides() {
    	Visitor v = new CalculandoNumeroLados();
    	visitFigures(v);
    	return v.getAcumulatoInt();
    }
    
    private void visitFigures(Visitor v){
    	for (Figure figure : figures) {
            figure.accept(v);;
        }
    }

}
