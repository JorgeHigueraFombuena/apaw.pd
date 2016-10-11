package es.upm.miw.pd.memento;

import es.upm.miw.pd.command.calculator.Calculator;
import upm.jbb.IO;

public class CalculadoraMementable extends Calculator implements Mementable<MementoCalculadora>{
	
	public CalculadoraMementable(){
		super();
	}

	protected void setTotal(int total) {
		super.setTotal(total);
	}

	public void add(int valor) {
		super.add(valor);
	}

	public void subtract(int valor) {
		super.subtract(valor);
	}

	public void reset() {
		super.reset();
	}

	@Override
	public MementoCalculadora createMemento() {
		MementoCalculadora memento = new MementoCalculadora(getTotal());
		return memento;
	}

	@Override
	public void restoreMemento(MementoCalculadora memento) {
		this.setTotal(memento.getValor());
	}
}
