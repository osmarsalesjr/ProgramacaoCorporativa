package domain;

import java.util.Calendar;

public class UsuarioComum extends Usuario{
	
	private Perfil meuPerfil;
	
	public UsuarioComum(String nome, Calendar dataDeAtivacao, Login meuLogin, Perfil meuPerfil) {
		
		super(nome, dataDeAtivacao, meuLogin);
		this.meuPerfil = meuPerfil;
	}

	public Perfil getMeuPerfil() {
		
		return meuPerfil;
	}
}
