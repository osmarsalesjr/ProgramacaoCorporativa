package domain;

import java.util.*;

public class Escala {
	
	private String horarioEntrada;
	private String horarioSaida;
	private int intervalo;
	private List<Funcionario> funcionariosEscala;
	
	public Escala(String horarioEntrada, String horarioSaida, int intervalo) {
		
		this.horarioEntrada = horarioEntrada;
		this.horarioSaida = horarioSaida;
		this.intervalo = intervalo;
		this.funcionariosEscala = new ArrayList<Funcionario>();
	}
	
	public String getHorarioEntrada() {
		
		return horarioEntrada;
	}
	
	public String getHorarioSaida() {
		
		return horarioSaida;
	}
	
	public int getIntervalo() {
		
		return intervalo;
	}
	
	public void addFuncionario(Funcionario funcionario){
		
		this.funcionariosEscala.add(funcionario);
	}
	
	public void removeFuncionario(Funcionario funcionario){
		
		this.funcionariosEscala.remove(funcionario);
	}
}
