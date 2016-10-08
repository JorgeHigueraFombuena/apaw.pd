package es.upm.miw.pd.state;

import es.upm.miw.pd.state.connection.Estado;

public class Context {
    private State state;

    public Context() {
        this.setState(new Cerrado());
    }
    
    public Estado getEstado(){
    	return state.getEstado();
    }

    protected void setState(State state) {
        this.state = state;
    }

    public void abrir() {
        state.abrir(this);
    }

    public void cerrar() {
        state.cerrar(this);
    }
    
    public void iniciar(){
    	state.iniciar(this);
    }
    
    public void parar(){
    	state.parar(this);
    }
    
    public void enviar(){
    	state.enviar(this);
    }

    public void recibir(int value){
    	state.recibir(this, value);
    }
    
    @Override
    public String toString() {
        return "Context[" + state.toString() + "]";
    }

}
