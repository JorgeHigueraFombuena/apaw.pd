package es.upm.miw.pd.state;

import es.upm.miw.pd.state.connection.Estado;

public abstract class State {
	
	public abstract Estado getEstado();
	
    public abstract void abrir(Context context);

    public abstract void cerrar(Context context);
    
    public abstract void iniciar(Context context);
    
    public abstract void parar(Context context);
    
    public abstract void enviar(Context context, String msg);
    
    public abstract void recibir(Context context, int value);
}
