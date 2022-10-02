package ar.edu.unq.po2.tp6;

import java.util.ArrayList;

public class Correo {
	private String asunto;
	private String destinatario;
	private String usuario;
	private String passUsuario;
	private String cuerpo;
	private ArrayList<Correo> inbox;
	private ArrayList<Correo> borrados;

	public Correo(String asunto, String destinatario, String cuerpo, String usuario, String pass) {
		this.setAsunto(asunto);
		this.setDestinatario(destinatario);
		this.setCuerpo(cuerpo);
		this.setUsuario(usuario);
		this.setPassUsuario(pass);
		
		
	}

	public Correo(String asunto, String destinatario, String cuerpo) {
		
		this.asunto = asunto;
		this.destinatario = destinatario;
		this.cuerpo = cuerpo;
	}

	public int contarBorrados() {
		return this.borrados.size();
	}

	public int contarInbox() {
		return this.inbox.size();
	}

	public String getAsunto() {
		return asunto;
	}

	public void setAsunto(String asunto) {
		this.asunto = asunto;
	}

	public String getDestinatario() {
		return destinatario;
	}

	public void setDestinatario(String destinatario) {
		this.destinatario = destinatario;
	}

	public String getCuerpo() {
		return cuerpo;
	}

	public void setCuerpo(String cuerpo) {
		this.cuerpo = cuerpo;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getPassUsuario() {
		return passUsuario;
	}

	public void setPassUsuario(String passUsuario) {
		this.passUsuario = passUsuario;
	}

	
}
