package domain;

import java.util.*;

public class Voo {
	
	private int numeroVoo;
	private String dataSaida;
	private String horarioDeSaida;
	private Companhia companhia;
	private Local localDestino;
	private Escala escala;
	private List<Passageiro> passageiros;
	private List<Funcionario> funcionarios;
	private List<Classe> classes;
	
	public Voo(int numeroVoo, String dataSaida, String horarioDeSaida, Companhia companhia, Local local, Escala escala) {
		
		this.numeroVoo = numeroVoo;
		this.dataSaida = dataSaida;
		this.horarioDeSaida = horarioDeSaida;
		this.companhia = companhia;
		this.localDestino = local;
		this.escala = escala;
		this.passageiros = new ArrayList<Passageiro>();
		this.funcionarios = new ArrayList<Funcionario>();
		this.classes = new ArrayList<Classe>();
	}
}
