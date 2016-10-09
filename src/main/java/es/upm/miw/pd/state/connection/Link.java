package es.upm.miw.pd.state.connection;

public interface Link {
    static final int ACK = 0;

    public void enviar(String msg);
    public void recibir (int respuesta);
}
