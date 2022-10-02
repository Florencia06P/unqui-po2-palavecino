package ar.edu.unq.po2.tp6;

import java.util.ArrayList;

public class ClienteEMail {

	private ServidorPop servidor;
	private static String nombreUsuario;
	private static String passusuario;
	private ArrayList<Correo> inbox;
	private ArrayList<Correo> borrados;

	public ClienteEMail(ServidorPop servidor, String nombreUsuario, String pass) {
		this.servidor = servidor;
		ClienteEMail.nombreUsuario = nombreUsuario;
		ClienteEMail.passusuario = pass;
		this.inbox = new ArrayList<Correo>();
		this.borrados = new ArrayList<Correo>();
		this.conectar();
	}

	public void conectar() {
		this.servidor.conectar(ClienteEMail.nombreUsuario, ClienteEMail.getPassusuario());
	}

	public void borrarCorreo(Correo correo) {
		this.inbox.remove(correo);
		this.borrados.remove(correo);
	}

	public void eliminarBorrado(Correo correo) {
		this.borrados.remove(correo);
	}

	public void recibirNuevos() {
		this.servidor.recibirNuevos(ClienteEMail.getNombreUsuario(), ClienteEMail.passusuario);
	}

	public void enviarCorreo(String asunto, String destinatario, String cuerpo) {
		Correo correo = new Correo(asunto, destinatario, cuerpo);
		this.servidor.enviar(correo);
	}

	public static String getNombreUsuario() {
		return nombreUsuario;
	}

	public void setNombreUsuario(String nombreUsuario) {
		ClienteEMail.nombreUsuario = nombreUsuario;
	}

	public static String getPassusuario() {
		return passusuario;
	}

	public void setPassusuario(String passusuario) {
		ClienteEMail.passusuario = passusuario;
	}

}
