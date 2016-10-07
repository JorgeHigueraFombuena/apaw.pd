package es.upm.miw.pd.state;

public class Preparado extends State {

	@Override
	public String toString(){
		return "Estado preparado";
	}
	
	@Override
	public void abrir(Context context) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void cerrar(Context context) {
		context.setState(new Cerrado());
	}

	@Override
	public void iniciar(Context context) {
		
	}

	@Override
	public void parar(Context context) {
		context.setState(new Parado());
	}

	@Override
	public void enviar(Context context) {
		context.setState(new Esperando());
	}

	@Override
	public void recibir(Context context, int value) {
		throw new UnsupportedOperationException();
	}

}
