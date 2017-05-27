package domain;

import java.util.*;

public class Nivel {
	
	private int classificacao;
	private List<Recompensa> recompensas;
	private List<Fidelidade> fidelidades;
	
	public Nivel(int classificacao) {
		
		this.classificacao = classificacao;
		this.recompensas = new ArrayList<Recompensa>();
		this.fidelidades = new ArrayList<Fidelidade>();
	}
}
