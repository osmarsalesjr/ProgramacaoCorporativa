package domain;

public class Onibus {
	
	private int numeroDeSerie;
	private Escala escala;
	
	public Onibus(int numeroDeSerie, Escala escala) {
		
		this.numeroDeSerie = numeroDeSerie;
		this.escala = escala;
	}
	
	public int getNumeroDeSerie() {
		
		return numeroDeSerie;
	}
	
	public Escala getEscala() {
		
		return escala;
	}
	
	public void setEscala(Escala escala) {
		
		this.escala = escala;
	}
}
