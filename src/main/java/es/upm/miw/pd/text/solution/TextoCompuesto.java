package es.upm.miw.pd.text.solution;

import java.util.ArrayList;
import java.util.List;

public class TextoCompuesto extends TextoContenedor {

	private List<Texto> componentes;
	
	public TextoCompuesto(){
		this.componentes = new ArrayList<Texto>();
	}
	
	@Override
	public void add(Texto t){
		if(!(t instanceof Caracter)){
			this.componentes.add(t);
		}
		else {
			throw new UnsupportedOperationException();
		}
	}

	@Override
	public void delete(Texto t) {
		componentes.remove(t);
	}

	@Override
	public String dibujar(boolean mayusculas) {
		String solucion = "";
		for(Texto t : componentes){
			solucion += t.dibujar(mayusculas);
		}
		return solucion + "---o---\n";
	}
}
