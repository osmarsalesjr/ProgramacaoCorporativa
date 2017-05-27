package domain;

import java.util.ArrayList;
import java.util.List;

public class Fidelidade {
	
	private String descricao;
	private Nivel nivel;
	private double valor;
	private List<Cliente> clientes;
	
	public Fidelidade(String descricao, Nivel nivel, double valor) {
		
		this.descricao = descricao;
		this.nivel = nivel;
		this.valor = valor;
		this.clientes = new ArrayList<Cliente>();
	}
	
}
