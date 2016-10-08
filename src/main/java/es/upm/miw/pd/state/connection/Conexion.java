package es.upm.miw.pd.state.connection;

import es.upm.miw.pd.state.Context;

public class Conexion {
	private Context context;

	private Link link;

	public Conexion(Link link) {
		assert link != null;
		this.link = link;
		context = new Context();
	}

	public Link getLink() {
		return link;
	}

	public Estado getEstado() {
		return context.getEstado();
	}

	public void abrir() {
		context.abrir();
	}

	public void cerrar() {
		context.cerrar();
	}

	public void parar() {
		context.parar();
	}

	public void iniciar() {
		context.parar();
	}

	public void enviar(String msg) {
		context.enviar(msg);
	}

	public void recibir(int respuesta) {
		context.recibir(respuesta);
	}

}
