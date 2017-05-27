package domain;

import java.util.*;

public class Aeroporto {
	
	private String nome;
	private Local local;
	private List<Companhia> companhias;
	
	public Aeroporto(String nome, Local local) {
		
		this.nome = nome;
		this.local = local;
		this.companhias = new ArrayList<Companhia>();
	}
}
