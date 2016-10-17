package es.upm.miw.pd.text.solution;

public class Caracter extends Texto {

	private char c;
	
	public Caracter(char c){
		this.c=c;
	}
	
	@Override
	public void add(Texto t) {
	}

	@Override
	public void delete(Texto t) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String dibujar(boolean mayusculas) {
		if(mayusculas){
			return String.valueOf(Character.toUpperCase(this.c));
		}
		else if (!mayusculas){
			return String.valueOf(this.c);
		}
		return null;
	}

}
