package domain;

import java.util.*;

public class Permissao {
	
	private String descricao;
	private List<Grupo> grupos;
	
	public Permissao(String descricao) {
		
		this.descricao = descricao;
		this.grupos = new ArrayList<Grupo>();
	}
	
}
