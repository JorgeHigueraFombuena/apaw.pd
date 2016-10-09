package es.upm.miw.pd.visitor.figure.solution;

import java.util.ArrayList;
import java.util.Collection;

import upm.jbb.IO;

public final class VisitorMain {
	private FiguresManager figuresManager = new FiguresManager();

	public VisitorMain() {
		figuresManager.add(new Circle("Circulo", 2, 1));
		figuresManager.add(new Square("Cuardado", 2, 4));
		figuresManager.add(new Triangle("Triángulo", 2, 2, 3));
	}

	public void visitador1() {
		IO.getIO().println("Área total: " + figuresManager.totalArea());
		IO.getIO().println("Num lados total: " + figuresManager.totalNumberOfSides());
	}

	public static void main(String[] args) {
		IO.getIO().addView(new VisitorMain());
	}
}
