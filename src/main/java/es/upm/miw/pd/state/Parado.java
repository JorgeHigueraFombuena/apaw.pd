package es.upm.miw.pd.state;

public class Parado extends State {

	@Override
	public void abrir(Context context) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void cerrar(Context context) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void iniciar(Context context) {
		context.setState(new Preparado());
	}

	@Override
	public void parar(Context context) {
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
