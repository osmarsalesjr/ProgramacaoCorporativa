package domain;

import java.util.*;

public class SistemaDeControleAutentificacaoPermissoes {
	
	private List<Usuario> usuarios;
	private List<Grupo> grupos;
	
	public SistemaDeControleAutentificacaoPermissoes() {
		
		this.usuarios = new ArrayList<Usuario>();
		this.grupos = new ArrayList<Grupo>();
	}
	
}
