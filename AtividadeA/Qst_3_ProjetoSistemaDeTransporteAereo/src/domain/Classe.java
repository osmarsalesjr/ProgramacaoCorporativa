package domain;

import java.util.*;

public class Classe {
	
	private String descricao;
	private List<Passageiro> passageiros;
	
	public Classe(String descricao) {
		
		this.descricao = descricao;
		this.passageiros = new ArrayList<Passageiro>();
	}
}
