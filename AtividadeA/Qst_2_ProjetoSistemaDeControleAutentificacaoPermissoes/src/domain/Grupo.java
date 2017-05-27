package domain;

import java.util.ArrayList;
import java.util.List;

public class Grupo {
	
	private String descricao;
	private List<Permissao> permissoes;
	private List<Usuario> usuarios;
	
	public Grupo(String descricao) {
		
		this.descricao = descricao;
		this.permissoes = new ArrayList<Permissao>();
		this.usuarios = new ArrayList<Usuario>();
	}
}
