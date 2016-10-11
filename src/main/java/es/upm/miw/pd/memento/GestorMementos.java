package es.upm.miw.pd.memento;

import java.util.SortedMap;
import java.util.TreeMap;

public class GestorMementos {
    private SortedMap<String, MementoCalculadora> lista;
    
    private static GestorMementos gestorMementos = new GestorMementos();
    
    private GestorMementos(){
    	lista = new TreeMap<String, MementoCalculadora>();
    }
    
    public static GestorMementos getInstance(){
    	return gestorMementos;
    }

    public void addMemento(String key, MementoCalculadora memento) {
        this.lista.put(this.lista.size() + ":" + key, memento);
    }

    public MementoCalculadora getMemento(String key) {
        return this.lista.get(key);
    }

    public String[] keys() {
        return this.lista.keySet().toArray(new String[0]);
    }
}
