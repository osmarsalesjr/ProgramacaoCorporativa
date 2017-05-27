package domain;

import java.util.*;

public class Rota {
	
	private Linha linha;
	private List<Parada> pontosParada;
	
	public Rota(Linha linha) {
		
		this.linha = linha;
		this.pontosParada = new ArrayList<Parada>();
	}
	
	public Linha getLinha() {
		
		return linha;
	}
	
	public void addPontoParada(Parada parada){
		
		this.pontosParada.add(parada);
	}
	
	public void removePontoParada(Parada parada){
		
		this.pontosParada.remove(parada);
	}
}
