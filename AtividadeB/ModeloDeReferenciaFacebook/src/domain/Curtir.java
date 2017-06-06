package domain;

public class Curtir {
	
	private String tipo;
	private UsuarioComum usuario;
	private boolean estaAtivo;
	
	public Curtir(String tipo, UsuarioComum usuario) {
		
		this.tipo = tipo;
		this.usuario = usuario;
		this.estaAtivo = true;
	}
	
	public String getTipo() {
		
		return tipo;
	}
	
	public UsuarioComum getUsuario() {
		
		return usuario;
	}

	public boolean isEstaAtivo() {
		
		return estaAtivo;
	}

	public void setEstaAtivo(boolean estaAtivo) {
		
		this.estaAtivo = estaAtivo;
	}
}
