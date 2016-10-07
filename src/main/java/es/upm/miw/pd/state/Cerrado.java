package es.upm.miw.pd.state;

import es.upm.miw.pd.state.connection.Estado;

public class Cerrado extends State {
	
    @Override
    public String toString() {
        return "Estado cerrado";
    }

	@Override
	public void abrir(Context context) {
		context.setState(new Preparado());
	}

	@Override
	public void cerrar(Context context) {
	}

	@Override
	public void iniciar(Context context) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void parar(Context context) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void enviar(Context context) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void recibir(Context context, int value) {
		throw new UnsupportedOperationException();
	}

}
