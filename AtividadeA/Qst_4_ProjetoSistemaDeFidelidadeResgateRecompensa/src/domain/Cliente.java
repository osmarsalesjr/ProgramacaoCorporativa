package domain;

import java.util.*;

public class Cliente {
	
	private String nome;
	private int identificacao;
	private int pontosAcumulados;
	private int tempoDeContrato;
	private Fidelidade fidelidade;
	private List<ServicoOuProduto> servicosOuProdutos;
	private List<Resgate> resgates;
	
	public Cliente(String nome, int identificacao, int tempoDeContrato, Fidelidade fidelidade) {
		
		this.nome = nome;
		this.identificacao = identificacao;
		this.fidelidade = fidelidade;
		this.tempoDeContrato = tempoDeContrato;
		this.pontosAcumulados = 0;
		this.servicosOuProdutos = new ArrayList<ServicoOuProduto>();
		this.resgates = new ArrayList<Resgate>();
	}
}
