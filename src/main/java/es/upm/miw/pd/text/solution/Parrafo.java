package es.upm.miw.pd.text.solution;

import java.util.ArrayList;
import java.util.List;

public class Parrafo extends TextoContenedor {

	private List<Texto> texto;
	
	public Parrafo(){
		this.texto = new ArrayList<Texto>();
	}
	
	@Override
	public void add(Texto t) {
		texto.add(t);
	}

	@Override
	public void delete(Texto t) {
	}

	@Override
	public String dibujar(boolean mayusculas) {
		String solucion = "";
		for(Texto t : texto){
			solucion += t.dibujar(mayusculas);
		}
		return solucion;
	}

}
