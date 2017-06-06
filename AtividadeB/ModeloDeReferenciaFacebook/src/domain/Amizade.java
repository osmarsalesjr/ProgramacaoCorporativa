package domain;

import java.util.Calendar;

public class Amizade {
	
	private UsuarioComum usuarioAmigo;
	private Calendar data;
	private String status;
	
	public Amizade(UsuarioComum usuario, Calendar data, String status) {
		
		this.usuarioAmigo = usuario;
		this.data = data;
		this.status = status;
	}

	public UsuarioComum getUsuario() {
		
		return usuarioAmigo;
	}
	
	public Calendar getData() {
		
		return data;
	}
	
	public String getStatus() {
		
		return status;
	}
	
	public void setStatus(String status) {
		
		this.status = status;
	}
}
