package es.upm.miw.pd.state;

import es.upm.miw.pd.state.connection.Estado;

public class Preparado extends State {

	private Estado estado;
	
	public Preparado(){
		this.estado = Estado.PREPARADO;
	}
	
	@Override
	public Estado getEstado(){
		return estado;
	}
	
	@Override
	public String toString(){
		return "Estado preparado";
	}
	
	@Override
	public void abrir(Context context) {
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
	public void enviar(Context context, String msg) {
		context.setState(new Esperando(msg));
	}

	@Override
	public void recibir(Context context, int value) {
		throw new UnsupportedOperationException();
	}

}
