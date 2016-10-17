package es.upm.miw.pd.text.solution;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class FactoriaCaracter {

	private static FactoriaCaracter factoria = new FactoriaCaracter();
	
	private List<Caracter> caracteres;
	
	private FactoriaCaracter(){
		caracteres = new ArrayList<Caracter>();
	}
	
	public static FactoriaCaracter getFactoria(){
		return factoria;
	}
	
	public Caracter get(char c){
		if(caracteres.contains(new Caracter(c))){
			return caracteres.get(caracteres.indexOf(new Caracter(c)));
		}
		else if (!caracteres.contains(new Caracter(c))){
			Caracter caracter = new Caracter(c);
			caracteres.add(caracter);
			return caracter;
		}
		return null;
	}
	
}
