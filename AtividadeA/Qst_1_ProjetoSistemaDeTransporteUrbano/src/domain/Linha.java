package domain;

public class Linha {
	
	private int numeroLinha;
	private Local localOrigem;
	private Local localDestino;
	private Rota rota;
	private Onibus onibus;
	
	public Linha(int numeroLinha, Local localOrigem, Local localDestino, Rota rota, Onibus onibus) {
		
		this.numeroLinha = numeroLinha;
		this.localOrigem = localOrigem;
		this.localDestino = localDestino;
		this.rota = rota;
		this.onibus = onibus;
	}
	
	public int getNumeroLinha() {
		
		return numeroLinha;
	}
	
	public void setRota(Rota rota) {
		
		this.rota = rota;
	}
	
	public void setOnibus(Onibus onibus) {
		
		this.onibus = onibus;
	}
}
