package domain;

public class SolicitacaoDeAmizade {
	
	private UsuarioComum usuarioRemetente;
	private boolean isAccept;
	
	public SolicitacaoDeAmizade(UsuarioComum usuarioRemetente) {
		
		this.usuarioRemetente = usuarioRemetente;
		this.setAccept(false);
	}
	
	public UsuarioComum getUsuarioRemetente() {
		
		return usuarioRemetente;
	}

	public boolean isAccept() {
		
		return isAccept;
	}

	public void setAccept(boolean isAccept) {
		
		this.isAccept = isAccept;
	}
}
