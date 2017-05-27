package domain;

import java.util.*;

public class Cargo {
	
	private String descricao;
	private List<Funcionario> funcionarios;
	
	public Cargo(String descricao) {
		
		this.descricao = descricao;
		this.funcionarios = new ArrayList<Funcionario>();
	}
}
