package es.upm.miw.pd.state;

public class Esperando extends State {

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
		if(value == 0){
			context.setState(new Cerrado());
		}
		else if (value > 0){
			context.setState(new Preparado());
		}
	}

}
