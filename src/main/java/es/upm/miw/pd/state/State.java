package es.upm.miw.pd.state;

public abstract class State {
    public abstract void abrir(Context context);

    public abstract void cerrar(Context context);
    
    public abstract void iniciar(Context context);
    
    public abstract void parar(Context context);
    
    public abstract void enviar(Context context);
    
    public abstract void recibir(Context context, int value);
}
