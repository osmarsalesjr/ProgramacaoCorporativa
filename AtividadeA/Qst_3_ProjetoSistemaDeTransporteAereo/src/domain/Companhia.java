package domain;

import java.util.*;

public class Companhia {
	
	private String nome;
	private String cnpj;
	private List<Voo> voos;
	private List<Aeroporto> aeroportos;
	
	public Companhia(String nome, String cnpj) {
		
		this.nome = nome;
		this.cnpj = cnpj;
		this.voos = new ArrayList<Voo>();
		this.aeroportos = new ArrayList<Aeroporto>();
	}
	
}
